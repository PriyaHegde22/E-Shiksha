package com.example.eshikshaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class subSelect5 extends AppCompatActivity {
    TextView dbms, artificial, pyt, atc, management;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_select5);

        dbms = findViewById(R.id.dbase);
        artificial = findViewById(R.id.artificial);
        pyt = findViewById(R.id.pyth);
        atc = findViewById(R.id.autocom);
        management = findViewById(R.id.manage);

        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),databaseSys.class);
                startActivity(intent);
            }
        });

        artificial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),artificial_int.class);
                startActivity(intent);
            }
        });

        pyt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),pyth.class);
                startActivity(intent);
            }
        });

        atc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),atc.class);
                startActivity(intent);
            }
        });

        management.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),management.class);
                startActivity(intent);
            }
        });
    }
}