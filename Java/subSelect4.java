package com.example.eshikshaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class subSelect4 extends AppCompatActivity {
    TextView daa, micro, oops, datacom, opsys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_select4);

        daa = findViewById(R.id.designan);
        micro = findViewById(R.id.microcont);
        datacom = findViewById(R.id.datacom);
        oops = findViewById(R.id.objpro);
        opsys = findViewById(R.id.opsyst);

        daa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),designAnalysis.class);
                startActivity(intent);
            }
        });

        micro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),microcont.class);
                startActivity(intent);
            }
        });

        datacom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),datacom.class);
                startActivity(intent);
            }
        });

        oops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),objectori.class);
                startActivity(intent);
            }
        });

        opsys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),operatings.class);
                startActivity(intent);
            }
        });
    }
}