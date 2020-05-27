package sg.edu.rp.c346.id18016446.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tv;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tv = findViewById(R.id.textViewModule);
        btnReturn = findViewById(R.id.buttonReturn);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("moduleCode");
        String moduleName = intentReceived.getStringExtra("moduleName");
        String moduleVenue = intentReceived.getStringExtra("moduleVenue");
        tv.setText(String.format("Module Code: %s\nModule Name: %s\nAcademic Year: 2020\nSemester: 1\nModule Credit: 4\nVenue: %s", moduleCode, moduleName, moduleVenue));

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
