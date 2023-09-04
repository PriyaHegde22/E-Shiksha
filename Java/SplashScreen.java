package com.example.eshikshaapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread(){
            @Override
            public void run(){
                try{
                    sleep(2*1000);
                    Intent intent = new Intent(SplashScreen.this,RegisterActivity.class);
                    startActivity(intent);
                    finish();
                }catch(Exception e){

                }
                super.run();
            }
        };thread.start();
    }
}
