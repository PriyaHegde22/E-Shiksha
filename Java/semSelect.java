package com.example.eshikshaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class semSelect extends AppCompatActivity {
    TextView sem1, sem2, sem3, sem4, sem5, sem6, logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_select);
        sem1 = findViewById(R.id.sem_one);
        sem2 = findViewById(R.id.sem_two);
        sem3 = findViewById(R.id.sem_three);
        sem4 = findViewById(R.id.sem_four);
        sem5 = findViewById(R.id.sem_five);
        sem6 = findViewById(R.id.sem_six);

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),subSelect1.class);
                startActivity(intent);
            }
        });

        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),subSelect2.class);
                startActivity(intent);
            }
        });

        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),subSelect3.class);
                startActivity(intent);
            }
        });

        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),subSelect4.class);
                startActivity(intent);
            }
        });

        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),subSelect5.class);
                startActivity(intent);
            }
        });

        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(semSelect.this,subSelect6.class);
                startActivity(intent);
            }
        });
    }
}