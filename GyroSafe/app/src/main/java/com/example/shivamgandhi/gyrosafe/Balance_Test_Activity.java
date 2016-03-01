package com.example.shivamgandhi.gyrosafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

/**
 * Created by shivam gandhi on 2/25/2016.
 */

public class Balance_Test_Activity extends AppCompatActivity implements View.OnClickListener {

    int n = 1;
    Button btnarray[] = new Button[n];

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.balance_test);

        btnarray[0] = (Button)findViewById(R.id.button10);

        for(int i = 0; i <n; i++){
            btnarray[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v){
        if(v == findViewById(R.id.button10)){
            Intent myIntent = new Intent(this, Results_Page_Activity.class);
            startActivity(myIntent);
        }
    }

}
