package com.example.eshikshaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class subSelect6 extends AppCompatActivity {
    TextView machine, datascience, mad, bigdata, noncon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_select6);
        machine = findViewById(R.id.machine);
        datascience = findViewById(R.id.science);
        mad = findViewById(R.id.mobile);
        bigdata = findViewById(R.id.bigdata);
        noncon = findViewById(R.id.nonconvent);

        machine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),machine.class);
                startActivity(intent);
            }
        });

        datascience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),datascience.class);
                startActivity(intent);
            }
        });

        mad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),mobiledev.class);
                startActivity(intent);
            }
        });

        bigdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),bigdata.class);
                startActivity(intent);
            }
        });

        noncon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),nonconvent.class);
                startActivity(intent);
            }
        });
    }
}