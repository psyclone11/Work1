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

        SharedPreferences sharedPreferences = getSharedPreferences("payu", Context.MODE_PRIVATE);
        String yourname = sharedPreferences.getString("name","");

        Intent intent = getIntent();
        String name = intent.getStringExtra("yourName");
        TextView textName = (TextView) findViewById(R.id.textView3);
        textName.setText(name);
    }
}
