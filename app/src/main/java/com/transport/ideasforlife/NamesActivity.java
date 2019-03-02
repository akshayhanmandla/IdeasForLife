package com.transport.ideasforlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NamesActivity extends AppCompatActivity {
    Button btn_gandhi,btn_swami,btn_ravindra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names);
        getSupportActionBar().hide();




        btn_gandhi=(Button)findViewById(R.id.btn_mahatma);
        btn_swami=(Button)findViewById(R.id.btn_swami);
        btn_ravindra=(Button)findViewById(R.id.btn_ravindra);

        btn_gandhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MahatmaGandhi.class);
                startActivity(i);

            }
        });
        btn_swami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getApplicationContext(),SwamiVivekaNand.class);
                startActivity(i1);


            }
        });
        btn_ravindra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(getApplicationContext(),Ravindratagor.class);
                startActivity(i2);
            }
        });
    }
}
