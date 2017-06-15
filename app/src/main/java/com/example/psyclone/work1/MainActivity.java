package com.example.psyclone.work1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String yourname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);

        SharedPreferences sharedPreferences = getSharedPreferences("payu", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name","Elena");
        editor.putInt("idName",12);
        editor.commit();

        button.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        EditText  editTextName = (EditText) findViewById(R.id.yourname);
                        yourname = editTextName.getText().toString();

                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        intent.putExtra("yourname", yourname);
                        intent.putExtra("tel", "0914433384");
                        startActivity(intent);

                    }
                }
        );
    }

    public void click (View view){
        EditText editTextName = (EditText) findViewById(R.id.yourname);
        String yourName = editTextName.getText().toString();
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("yourname",yourname);
        intent.putExtra("tel","0630847155");
        startActivity(intent);
    }
}