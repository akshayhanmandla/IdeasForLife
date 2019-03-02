package com.transport.ideasforlife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MahatmaGandhi extends AppCompatActivity {

    TextView text_gandhi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahatma_gandhi);
        getSupportActionBar().hide();

        text_gandhi=(TextView)findViewById(R.id.txt_gandhi);
    }
}
