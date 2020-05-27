package sg.edu.rp.c346.id18016446.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC322;
    TextView tvC346;
    TextView tvC382;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC322 = findViewById(R.id.textView);
        tvC346 = findViewById(R.id.textView2);
        tvC382 = findViewById(R.id.textView3);

        tvC322.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleCode", "C322");
                intent.putExtra("moduleName", "Data Centre and Cloud Mgmt");
                intent.putExtra("moduleVenue", "E61G");
                startActivity(intent);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleCode", "C346");
                intent.putExtra("moduleName", "Android Programming");
                intent.putExtra("moduleVenue", "W67R");
                startActivity(intent);
            }
        });

        tvC382.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("moduleCode", "C382");
                intent.putExtra("moduleName", "IT Service Delivery");
                intent.putExtra("moduleVenue", "W67R");
                startActivity(intent);
            }
        });
    }
}
