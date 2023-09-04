package com.example.eshikshaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class subSelect3 extends AppCompatActivity {
    TextView datastr, analog, software, comp, maths3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_select3);
        datastr = findViewById(R.id.dstruct);
        analog = findViewById(R.id.analog);
        software = findViewById(R.id.software);
        comp = findViewById(R.id.compu);
        maths3 = findViewById(R.id.maths3);

        datastr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),datastruct.class);
                startActivity(intent);
            }
        });

        analog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ade.class);
                startActivity(intent);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),comporg.class);
                startActivity(intent);
            }
        });

        software.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),softwareeng.class);
                startActivity(intent);
            }
        });

        maths3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),math3.class);
                startActivity(intent);
            }
        });
    }
}