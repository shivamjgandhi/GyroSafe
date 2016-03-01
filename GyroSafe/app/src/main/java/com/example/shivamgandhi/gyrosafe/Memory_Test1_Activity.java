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

public class Memory_Test1_Activity extends AppCompatActivity implements View.OnClickListener {

    EditText ed23, ed24, ed25, ed26, ed27;
    int n = 1;
    Button btnarray[] = new Button[n];
    public static final String MyPREFERENCES = "MyPrefs";
    SharedPreferences sharedpreferences;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memory_test1);

        btnarray[0] = (Button)findViewById(R.id.button8);

        sharedpreferences = this.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        ed23 = (EditText)findViewById(R.id.editText23);
        ed24 = (EditText)findViewById(R.id.editText24);
        ed25 = (EditText)findViewById(R.id.editText25);
        ed26 = (EditText)findViewById(R.id.editText26);
        ed27 = (EditText)findViewById(R.id.editText27);

        for(int i = 0; i <n; i++){
            btnarray[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v){
        if(v == findViewById(R.id.button8)){

            String Town = ed23.getText().toString();
            String Win = ed24.getText().toString();
            String Month = ed25.getText().toString();
            String Day = ed26.getText().toString();
            String Team = ed27.getText().toString();

            int add_score = 0;

            SharedPreferences.Editor editor = sharedpreferences.edit();
            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

            String town_calib = prefs.getString("Town", "");
            String win_calib = prefs.getString("Win", "");
            String month_calib = prefs.getString("Month", "");
            String day_calib = prefs.getString("Day", "");
            String team_calib = prefs.getString("Team", "");

            if(Town != town_calib){
                add_score = add_score + 1;
            }

            if(Win !=  win_calib){
                add_score = add_score + 1;
            }

            if(Month != month_calib){
                add_score = add_score + 1;
            }

            if(Day != day_calib){
                add_score = add_score +1;
            }

            if(Team != team_calib){
                add_score = add_score+1;
            }

            int score = prefs.getInt("Score", 0);

            score = score + add_score;
            editor.putInt("Score", score);
            editor.commit();

            Toast.makeText(Memory_Test1_Activity.this, Integer.toString(score), Toast.LENGTH_LONG).show();

            Intent myIntent = new Intent(this, memory_test2.class);
            startActivity(myIntent);
        }
    }
}
