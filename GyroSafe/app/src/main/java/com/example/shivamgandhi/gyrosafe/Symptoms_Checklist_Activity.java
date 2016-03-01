package com.example.shivamgandhi.gyrosafe;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Symptoms_Checklist_Activity extends AppCompatActivity implements View.OnClickListener {

    EditText ed8, ed9, ed10, ed11, ed12, ed13, ed14, ed15, ed16, ed17, ed18, ed19, ed20, ed21, ed22, ed32, ed33, ed34, ed35, ed36;
    int n = 1;
    Button btnarray[] = new Button[n];
    int symptoms_checklist_arr[] = new int[20];
    public static final String MyPREFERENCES = "MyPrefs";
    SharedPreferences sharedpreferences;
    int score;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptoms_checklist);

        btnarray[0] = (Button)findViewById(R.id.button7);

        ed8 = (EditText)findViewById(R.id.editText8);
        ed9 = (EditText)findViewById(R.id.editText9);
        ed10 = (EditText)findViewById(R.id.editText10);
        ed11 = (EditText)findViewById(R.id.editText11);
        ed12 = (EditText)findViewById(R.id.editText12);
        ed13 = (EditText)findViewById(R.id.editText13);
        ed14 = (EditText)findViewById(R.id.editText14);
        ed15 = (EditText)findViewById(R.id.editText15);
        ed16 = (EditText)findViewById(R.id.editText16);
        ed17 = (EditText)findViewById(R.id.editText17);
        ed18 = (EditText)findViewById(R.id.editText18);
        ed19 = (EditText)findViewById(R.id.editText19);
        ed20 = (EditText)findViewById(R.id.editText20);
        ed21 = (EditText)findViewById(R.id.editText21);
        ed22 = (EditText)findViewById(R.id.editText22);
        ed32 = (EditText)findViewById(R.id.editText32);
        ed33 = (EditText)findViewById(R.id.editText33);
        ed34 = (EditText)findViewById(R.id.editText34);
        ed35 = (EditText)findViewById(R.id.editText35);
        ed36 = (EditText)findViewById(R.id.editText36);

        sharedpreferences = this.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        for (int i = 0; i < n; i++) {
            btnarray[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        if (v == findViewById(R.id.button7)) {

            //here, we take in all of the information that the user input and put it in the matrix.
            if (!(ed8.getText().toString().equals(""))){
                symptoms_checklist_arr[0] = Integer.parseInt(ed8.getText().toString());
            }
            else{
                symptoms_checklist_arr[0] = 0;
            }

            if (!(ed9.getText().toString().equals(""))){
                symptoms_checklist_arr[1] = Integer.parseInt(ed9.getText().toString());
            }
            else{
                symptoms_checklist_arr[1] = 0;
            }

            if (!(ed10.getText().toString().equals(""))){
                symptoms_checklist_arr[2] = Integer.parseInt(ed10.getText().toString());
            }
            else{
                symptoms_checklist_arr[2] = 0;
            }

            if (!(ed11.getText().toString().equals(""))){
                symptoms_checklist_arr[3] = Integer.parseInt(ed11.getText().toString());
            }
            else{
                symptoms_checklist_arr[3] = 0;
            }

            if(!(ed12.getText().toString().equals(""))){
                symptoms_checklist_arr[4] = Integer.parseInt(ed12.getText().toString());
            }
            else{
                symptoms_checklist_arr[4] = 0;
            }

            if(!(ed13.getText().toString().equals(""))){
                symptoms_checklist_arr[5] = Integer.parseInt(ed13.getText().toString());
            }
            else{
                symptoms_checklist_arr[6] = 0;
            }

            if(!(ed14.getText().toString().equals(""))){
                symptoms_checklist_arr[6] = Integer.parseInt(ed14.getText().toString());
            }
            else{
                symptoms_checklist_arr[6] = 0;
            }

            if(!(ed15.getText().toString().equals(""))){
                symptoms_checklist_arr[7] = Integer.parseInt(ed15.getText().toString());
            }
            else{
                symptoms_checklist_arr[7] = 0;
            }

            if(!(ed16.getText().toString().equals(""))){
                symptoms_checklist_arr[8] = Integer.parseInt(ed16.getText().toString());
            }
            else{
                symptoms_checklist_arr[8] = 0;
            }

            if(!(ed17.getText().toString().equals(""))){
                symptoms_checklist_arr[9] = Integer.parseInt(ed17.getText().toString());
            }
            else{
                symptoms_checklist_arr[9] = 0;
            }

            if(!(ed18.getText().toString().equals(""))){
                symptoms_checklist_arr[10] = Integer.parseInt(ed18.getText().toString());
            }
            else{
                symptoms_checklist_arr[10] = 0;
            }

            if(!(ed19.getText().toString().equals(""))){
                symptoms_checklist_arr[11] = Integer.parseInt(ed19.getText().toString());
            }
            else{
                symptoms_checklist_arr[11] = 0;
            }

            if(!(ed20.getText().toString().equals(""))){
                symptoms_checklist_arr[12] = Integer.parseInt(ed20.getText().toString());
            }
            else{
                symptoms_checklist_arr[12] = 0;
            }

            if(!(ed21.getText().toString().equals(""))){
                symptoms_checklist_arr[13] = Integer.parseInt(ed21.getText().toString());
            }
            else{
                symptoms_checklist_arr[13] = 0;
            }

            if(!(ed22.getText().toString().equals(""))){
                symptoms_checklist_arr[14] = Integer.parseInt(ed22.getText().toString());
            }
            else{
                symptoms_checklist_arr[14] = 0;
            }

            if(!(ed32.getText().toString().equals(""))){
                symptoms_checklist_arr[15] = Integer.parseInt(ed32.getText().toString());
            }
            else{
                symptoms_checklist_arr[15] = 0;
            }

            if(!(ed33.getText().toString().equals(""))){
                symptoms_checklist_arr[16] = Integer.parseInt(ed33.getText().toString());
            }
            else{
                symptoms_checklist_arr[16] = 0;
            }

            if(!(ed34.getText().toString().equals(""))){
                symptoms_checklist_arr[17] = Integer.parseInt(ed34.getText().toString());
            }
            else{
                symptoms_checklist_arr[17] = 0;
            }

            if(!(ed35.getText().toString().equals(""))){
                symptoms_checklist_arr[18] = Integer.parseInt(ed35.getText().toString());
            }
            else{
                symptoms_checklist_arr[18] = 0;
            }

            if(!(ed36.getText().toString().equals(""))){
                symptoms_checklist_arr[19] = Integer.parseInt(ed36.getText().toString());
            }
            else{
                symptoms_checklist_arr[19] = 0;
            }


            //Sum up these values to get an aggregate test score
            score = 0;
            for (int i = 0; i < 20; i++) {
                score = score + symptoms_checklist_arr[i];
            }

            //Now we return our value from shared preferences.

            SharedPreferences.Editor editor = sharedpreferences.edit();
            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);

            int symptoms_checklist_arr_base = prefs.getInt("Symptoms Checklist Baseline", 0);

            //Subtract
            score = score - symptoms_checklist_arr_base;

            //Store the new value into shared preferences to be carried onto the next screen
            editor.putInt("Score", score);
            editor.commit();
            Toast.makeText(Symptoms_Checklist_Activity.this, "Thanks", Toast.LENGTH_LONG).show();


            Intent myIntent = new Intent(this, Memory_Test1_Activity.class);
            startActivity(myIntent);
        }
    }
}
