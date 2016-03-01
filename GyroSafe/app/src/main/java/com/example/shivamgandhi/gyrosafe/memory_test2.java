package com.example.shivamgandhi.gyrosafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class memory_test2 extends AppCompatActivity implements View.OnClickListener {

    int n = 1;
    Button btnarray[] = new Button[n];

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memory_test2);

        btnarray[0] = (Button)findViewById(R.id.button9);

        for(int i = 0; i <n; i++){
            btnarray[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v){
        if(v == findViewById(R.id.button9)){
            Intent myIntent = new Intent(this, Balance_Test_Activity.class);
            startActivity(myIntent);
        }
    }

}
