package com.transport.ideasforlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Thread activeTime=new Thread()
        {
            public void run()
            {
                try {
                    sleep(3*1000);
                    Intent i=new Intent(getApplicationContext(),WelcomeActivity.class);
                    startActivity(i);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        activeTime.start();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
