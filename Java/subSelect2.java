package com.example.eshikshaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class subSelect2 extends AppCompatActivity {
    TextView phy, civ, elec, maths2, eng2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_select2);

        phy = findViewById(R.id.phys);
        civ = findViewById(R.id.civil);
        elec = findViewById(R.id.elec);
        maths2 = findViewById(R.id.math2);
        eng2 = findViewById(R.id.engl);

        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),physics.class);
                startActivity(intent);
            }
        });

        civ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),civil.class);
                startActivity(intent);
            }
        });

        elec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),electrical.class);
                startActivity(intent);
            }
        });

        maths2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),math2.class);
                startActivity(intent);
            }
        });

        eng2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),eng2.class);
                startActivity(intent);
            }
        });
    }
}