package com.example.shivamgandhi.gyrosafe;

import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.SharedPreferences;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;


public class settings_page_activity extends AppCompatActivity implements View.OnClickListener{

    EditText ed1, ed2;
    Button btnArray2[] = new Button[6];
    public static final String MyPREFERENCES = "MyPrefs";
    SharedPreferences sharedpreferences;
    TextView textView;
    TextView textView2;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_page);
        btnArray2[0] = (Button)findViewById(R.id.button3);
        btnArray2[1] = (Button)findViewById(R.id.button4);
        btnArray2[2] = (Button)findViewById(R.id.button5);
        btnArray2[3] = (Button)findViewById(R.id.button6);
        btnArray2[4] = (Button)findViewById(R.id.save_info_button);
        btnArray2[5] = (Button)findViewById(R.id.button12);

        for (int i = 0; i < btnArray2.length; i++){
            btnArray2[i].setOnClickListener(this);
        }

        sharedpreferences = this.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);

        textView = (TextView)findViewById(R.id.textView42);
        textView.setText(sharedpreferences.getString("Email", "No Email"));

        textView2 = (TextView)findViewById(R.id.textView43);
        textView2.setText(sharedpreferences.getString("Phone", "No Phone"));
    }

    @Override
    public void onClick(View v) {
        if(v == findViewById(R.id.button3)){
            Intent myIntent = new Intent(this, Symptoms_Checklist_Calibrate.class );
            startActivity(myIntent);
        }
        else if(v == findViewById(R.id.button4)){
            Intent myIntent = new Intent(this, MainActivity.class);
            startActivity(myIntent);
        }
        else if(v == findViewById(R.id.button5)){
            Intent myIntent = new Intent(this, MainActivity.class);
            startActivity(myIntent);
        }
        else if(v == findViewById(R.id.button6)){
            Intent myIntent = new Intent(this, MainActivity.class);
            startActivity(myIntent);
        }
        else if(v == findViewById(R.id.button12)){
            Intent myIntent = new Intent(this, Memory_Test1_Calibrate.class);
            startActivity(myIntent);
        }
        else if(v.getId() == R.id.save_info_button){

            String e  = ed1.getText().toString();
            String ph  = ed2.getText().toString();

            SharedPreferences.Editor editor = sharedpreferences.edit();

            if(!(e.equals(""))){
                editor.putString("Email", e);
            }

            if(!(ph.equals(""))){
                editor.putString("Phone", ph);
            }

            editor.commit();
            Toast.makeText(settings_page_activity.this,"Thanks",Toast.LENGTH_LONG).show();

            textView.setText(sharedpreferences.getString("Email", "No Email"));
            textView2.setText(sharedpreferences.getString("Phone", "No Phone"));
        }
    }
}
