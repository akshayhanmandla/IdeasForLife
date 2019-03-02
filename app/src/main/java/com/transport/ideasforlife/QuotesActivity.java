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

public class QuotesActivity extends AppCompatActivity {
    private String[] TRAINS= new String[] {"Be the change that you wish to see in the world.\n" +
            "\n"+
            "-Mahatma Gandhi",
            "Without music, life would be a mistake. \n" +
                    "\n"+
                    "― Friedrich Nietzsche, Twilight of the Idols\n",
            "I don’t want to earn my living; I want to live.\n" +
                    "\n"+
                    "― Oscar Wilde",
            "Life shrinks or expands in proportion to one’s courage." +
                    "\n"+
                    "\n"+
                    "-Anais Nin",
            "Don't cry because it's over, smile because it happened.\n" +
                    "\n"+
                    "― Dr. Seuss",
            "A room without books is like a body without a soul.\n" +
                    "\n"+
                    "― Marcus Tullius Cicero",
            "Don’t walk in front of me… I may not follow\n" +
                    "\n"+
                    "Don’t walk behind me… I may not lead\n" +
                    "\n"+
                    "Walk beside me… just be my friend\n" +
                    "\n"+
                    "― Albert Camus",
            "Whole World is Book learn form it.\n" +
                    "\n"+
                    "-Dhananjay ojha",
            "Every Book is a world in itself learn from it.\n" +
                    "\n"+
                    "-Dhananjay Ojha",
            "Always forgive your enemies; nothing annoys them so much.\n" +
                    "\n"+
                    "― Oscar Wilde",
    "For every mistake we should give lesson not the punishment.\n" +
            "\n"+
            "-Dhananjay Ojha"};
    private ListView list1_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);
        list1_view = (ListView) findViewById(R.id.lv1_layout);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.quots_list,TRAINS);
        list1_view.setAdapter(adapter);
        list1_view.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String tName = (String) list1_view.getItemAtPosition(position);
                        String tTimings = "Quots :\n";

                        View alertV = LayoutInflater.from(QuotesActivity.this).inflate(R.layout.quotetext,null);
                        TextView alertText = (TextView) alertV.findViewById(R.id.timings_label);
                        alertText.setText(tName);
                        AlertDialog.Builder alertB = new AlertDialog.Builder(QuotesActivity.this);
                        alertB.setMessage("Current Quotes  ")
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
