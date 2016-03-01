package com.example.shivamgandhi.gyrosafe;

import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.SharedPreferences;
import android.widget.TextView;

public class Results_Page_Activity extends AppCompatActivity implements View.OnClickListener {

    int n = 1;
    int score;
    Button btnarray[] = new Button[n];
    TextView textView39;
    TextView textView40;
    public static final String MyPREFERENCES = "MyPrefs";
    SharedPreferences sharedpreferences;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results_page);

        btnarray[0] = (Button)findViewById(R.id.button11);

        sharedpreferences = this.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);
        score = sharedpreferences.getInt("Score", 0);

        textView39 = (TextView)findViewById(R.id.textView39);
        if(score < 20){
            textView39.setText("Unlikely to have a concussion.");
        }
        else{
            textView39.setText("Possible concussion. Please seek medical help");
        }

        textView40 = (TextView)findViewById(R.id.textView40);
        textView40.setText(Integer.toString(sharedpreferences.getInt("Score", 0)));


        for(int i = 0; i <n; i++){
            btnarray[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v){
        if(v == findViewById(R.id.button11)){
            Intent myIntent = new Intent(this, MainActivity.class);
            startActivity(myIntent);
        }
    }

}
