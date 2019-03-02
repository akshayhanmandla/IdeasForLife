package com.transport.ideasforlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IdeasLife extends AppCompatActivity {
    Button btn_quotes,btn_biography,btn_lifehack,btn_fact;
    TextView lbl_val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ideas_life);



        btn_quotes=(Button)findViewById(R.id.btn_quotes);
        btn_biography=(Button)findViewById(R.id.btn_biography);
        //btn_lifehack=(Button)findViewById(R.id.btn_lifehack);
        btn_fact=(Button)findViewById(R.id.btn_facts);
        lbl_val=(TextView)findViewById(R.id.lbl_val);

        String name=getIntent().getExtras().getString("name");
        lbl_val.setText("Welcome "+name);

        btn_quotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),QuotesActivity.class);
                startActivity(i);


            }
        });
        btn_biography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(getApplicationContext(),NamesActivity.class);
                startActivity(i1);


            }
        });

        btn_fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(getApplicationContext(),Facts.class);
                startActivity(i3);


            }
        });
    }
}
