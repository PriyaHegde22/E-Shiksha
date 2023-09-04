package com.example.eshikshaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class subSelect1 extends AppCompatActivity {
    TextView chemistry, programing, mechanics, mathematics1, english1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_select1);

        chemistry = findViewById(R.id.chem);
        programing = findViewById(R.id.prog);
        mathematics1 = findViewById(R.id.maths1);
        mechanics = findViewById(R.id.mech);
        english1 = findViewById(R.id.engg);

        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chemistry.class);
                startActivity(intent);
            }
        });

        programing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),cpro.class);
                startActivity(intent);
            }
        });

        mathematics1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),math1.class);
                startActivity(intent);
            }
        });

        mechanics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),mechanics.class);
                startActivity(intent);
            }
        });

        english1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),eng1.class);
                startActivity(intent);
            }
        });
    }
}