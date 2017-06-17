package com.example.psyclone.work1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //SharedPreferences sharedPreferences = getSharedPreferences("payu", Context.MODE_PRIVATE);
       // String yourname = sharedPreferences.getString("name","");

        Intent intent = getIntent();
        String name = intent.getStringExtra("yourname");
        TextView textName = (TextView) findViewById(R.id.textView8);
        textName.setText(name);

        String faculty = intent.getStringExtra("faculty");
        TextView textfaculty = (TextView) findViewById(R.id.textView12);
        textfaculty.setText(faculty);

        String tell = intent.getStringExtra("tell");
        TextView texttell = (TextView) findViewById(R.id.textView13);
        texttell.setText(tell);

        String spinner = intent.getStringExtra("spinner");
        TextView textspinner = (TextView) findViewById(R.id.textView14);
        textspinner.setText(spinner);
    }
}
