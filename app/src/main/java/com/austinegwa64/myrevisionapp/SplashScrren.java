package com.austinegwa64.myrevisionapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScrren extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_scrren);

        Thread thread = new Thread(){
            @Override
            public  void run() {
                try {
                    sleep(3000);

                    Intent i = new Intent(getApplicationContext(), Login.class);
                    startActivity(i);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }

}
