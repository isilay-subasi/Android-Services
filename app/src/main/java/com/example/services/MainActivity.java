package com.example.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btnStart;
    public Button btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initThis();

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startHelloService();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopHelloService();
            }
        });



    }

    public void initThis(){
        btnStart=findViewById(R.id.startBtn);
        btnStop=findViewById(R.id.stopBtn);

    }

    private void startHelloService() {
        Intent intent = new Intent(getApplicationContext(),HelloService.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(intent);
        }else startService(intent);
    }

    private void stopHelloService() {

        Intent intent = new Intent(getApplicationContext(),HelloService.class);
        stopService(intent);

    }



}