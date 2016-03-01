package com.example.shivamgandhi.gyrosafe;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;


public class Memory_Test1_Calibrate extends AppCompatActivity implements View.OnClickListener{

    int n = 1;
    Button btnarray[] = new Button[n];
    EditText ed57, ed58, ed59, ed60, ed61;
    public static final String MyPREFERENCES = "MyPrefs";
    SharedPreferences sharedpreferences;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memory_test1_calibration);

        ed57 = (EditText)findViewById(R.id.editText57);
        ed58 = (EditText)findViewById(R.id.editText58);
        ed59 = (EditText)findViewById(R.id.editText59);
        ed60 = (EditText)findViewById(R.id.editText60);
        ed61 = (EditText)findViewById(R.id.editText61);

        btnarray[0] = (Button)findViewById(R.id.button15);

        sharedpreferences = this.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);


        for(int i = 0; i < n; i++){
            btnarray[i].setOnClickListener(this);
        }
    }

    public void onClick(View v) {
        if (v == findViewById(R.id.button15)) {

            String town = ed57.getText().toString();
            String win = ed58.getText().toString();
            String month = ed59.getText().toString();
            String day = ed60.getText().toString();
            String team = ed61.getText().toString();

            SharedPreferences.Editor editor = sharedpreferences.edit();

            editor.putString("Town", town);
            editor.putString("Win", win);
            editor.putString("Month", month);
            editor.putString("Day", day);
            editor.putString("Team", team);

            editor.commit();
            Toast.makeText(Memory_Test1_Calibrate.this,"Thanks",Toast.LENGTH_LONG).show();

            Intent myIntent = new Intent(this, MainActivity.class);
            startActivity(myIntent);

        }
    }

}
