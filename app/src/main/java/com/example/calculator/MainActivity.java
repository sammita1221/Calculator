package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Start a new thread for the splash screen
        Thread splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    // Sleep for the specified duration
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // After the splash screen duration, start the main activity
                    startActivity(new Intent(MainActivity.this, page.class));
                    finish();
                }
            }
        };

        // Start the splash thread
        splashThread.start();
    }
}