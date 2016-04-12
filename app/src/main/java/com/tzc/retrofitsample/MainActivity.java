package com.tzc.retrofitsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new My().start();
    }

    private class My extends Thread {
        @Override
        public void run() {
            super.run();
            Manager.proviceWeather().weather();
        }
    }
}
