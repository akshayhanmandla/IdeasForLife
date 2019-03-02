package com.transport.ideasforlife;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Facts extends AppCompatActivity {

    private String[] TRAINS= new String[] {"There are more Barbie dolls in Italy.\n",
            "It is physically impossible for pigs to look up into the sky.",
            "In England, the Speaker of the House is not allowed to speak.",
            "Every continent begins and ends in the same letter.",
            "Every continent has a city called Rome.",
            "Two thirds of the world's eggplant is grown in New Jersey.",
            "The electric chair was invented by a dentist.",
            "No president of the United States was an only child.",
            "A snail can sleep for 3 years.",
            "China has more English speakers than the United States.",
            "Every Book is a world in itself.",
            "For every mistake we should give lesson not the punishment."};
    private ListView list1_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);





            list1_view = (ListView) findViewById(R.id.lv_layout);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.fact_list,TRAINS);
            list1_view.setAdapter(adapter);
            list1_view.setOnItemClickListener(
                    new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            String tName = (String) list1_view.getItemAtPosition(position);
                            String tTimings = "Facts :\n";

                            View alertV = LayoutInflater.from(Facts.this).inflate(R.layout.facttext,null);
                            TextView alertText = (TextView) alertV.findViewById(R.id.timings_label);
                            alertText.setText(tName);
                            AlertDialog.Builder alertB = new AlertDialog.Builder(Facts.this);
                            alertB.setMessage("Current Fact  ")
                                    .setView(alertV)
                                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialog, int which) {
                                            return;
                                        }
                                    })
                                    .setCancelable(false);
                            AlertDialog alert = alertB.create();
                            alert.show();
                        }
                    }
            );

        }
}
