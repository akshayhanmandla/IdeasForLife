package com.transport.ideasforlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WelcomeActivity extends AppCompatActivity {
    Button btn_login;
    EditText edtxt_unm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        edtxt_unm=(EditText)findViewById(R.id.edtxt_unm);
        btn_login=(Button)findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),IdeasLife.class);
                i.putExtra("name",edtxt_unm.getText().toString());
                startActivity(i);
            }
        });

    }
}

