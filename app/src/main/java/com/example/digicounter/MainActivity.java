package com.example.digicounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvCountDisplay;
    Button btnCount;
    Button btnToast;
    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         tvCountDisplay =findViewById(R.id.tv_count_display);
         tvCountDisplay.setText(String.valueOf(counter));
         btnCount=findViewById(R.id.count_btn);
         btnCount.setOnClickListener(v-> {
            counter++;
            tvCountDisplay.setText(String.valueOf(counter));


         });
         btnToast=findViewById(R.id.toast_btn);
        btnToast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello Toast",Toast.LENGTH_SHORT).show();
            }
        });

    }
    }
