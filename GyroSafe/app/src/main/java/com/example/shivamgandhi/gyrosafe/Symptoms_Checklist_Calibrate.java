package com.example.shivamgandhi.gyrosafe;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Symptoms_Checklist_Calibrate extends AppCompatActivity implements View.OnClickListener {

    EditText ed37, ed38, ed39, ed40, ed41, ed42, ed43, ed44, ed45, ed46, ed47, ed48, ed49, ed50, ed51, ed52, ed53, ed54, ed55, ed56;
    int n = 1;
    Button btnarray[] = new Button[n];
    public static final String MyPREFERENCES = "MyPrefs";
    int symptoms_checklist_arr_base[] = new int[20];
    SharedPreferences sharedpreferences;
    SharedPreferences.Editor preferenceEditor;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptoms_checklist_calibration);

        btnarray[0] = (Button)findViewById(R.id.button14);

        ed37 = (EditText)findViewById(R.id.editText37);
        ed38 = (EditText)findViewById(R.id.editText38);
        ed39 = (EditText)findViewById(R.id.editText39);
        ed40 = (EditText)findViewById(R.id.editText40);
        ed41 = (EditText)findViewById(R.id.editText41);
        ed42 = (EditText)findViewById(R.id.editText42);
        ed43 = (EditText)findViewById(R.id.editText43);
        ed44 = (EditText)findViewById(R.id.editText44);
        ed45 = (EditText)findViewById(R.id.editText45);
        ed46 = (EditText)findViewById(R.id.editText46);
        ed47 = (EditText)findViewById(R.id.editText47);
        ed48 = (EditText)findViewById(R.id.editText48);
        ed49 = (EditText)findViewById(R.id.editText49);
        ed50 = (EditText)findViewById(R.id.editText50);
        ed51 = (EditText)findViewById(R.id.editText51);
        ed52 = (EditText)findViewById(R.id.editText52);
        ed53 = (EditText)findViewById(R.id.editText53);
        ed54 = (EditText)findViewById(R.id.editText54);
        ed55 = (EditText)findViewById(R.id.editText55);
        ed56 = (EditText)findViewById(R.id.editText56);

        sharedpreferences = this.getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);


        for(int i = 0; i < btnarray.length; i++){
            btnarray[i].setOnClickListener(this);
        }
    }

    public void onClick(View v) {
        if (v == findViewById(R.id.button14)) {
            if (!(ed37.getText().toString().equals(""))){
                symptoms_checklist_arr_base[0] = Integer.parseInt(ed37.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[0] = 0;
            }

            if (!(ed38.getText().toString().equals(""))){
                symptoms_checklist_arr_base[1] = Integer.parseInt(ed38.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[1] = 0;
            }

            if (!(ed39.getText().toString().equals(""))){
                symptoms_checklist_arr_base[2] = Integer.parseInt(ed39.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[2] = 0;
            }

            if (!(ed40.getText().toString().equals(""))){
                symptoms_checklist_arr_base[3] = Integer.parseInt(ed40.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[3] = 0;
            }

            if(!(ed41.getText().toString().equals(""))){
                symptoms_checklist_arr_base[4] = Integer.parseInt(ed41.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[4] = 0;
            }

            if(!(ed42.getText().toString().equals(""))){
                symptoms_checklist_arr_base[5] = Integer.parseInt(ed42.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[6] = 0;
            }

            if(!(ed43.getText().toString().equals(""))){
                symptoms_checklist_arr_base[6] = Integer.parseInt(ed43.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[6] = 0;
            }

            if(!(ed44.getText().toString().equals(""))){
                symptoms_checklist_arr_base[7] = Integer.parseInt(ed44.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[7] = 0;
            }

            if(!(ed45.getText().toString().equals(""))){
                symptoms_checklist_arr_base[8] = Integer.parseInt(ed45.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[8] = 0;
            }

            if(!(ed46.getText().toString().equals(""))){
                symptoms_checklist_arr_base[9] = Integer.parseInt(ed46.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[9] = 0;
            }

            if(!(ed47.getText().toString().equals(""))){
                symptoms_checklist_arr_base[10] = Integer.parseInt(ed47.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[10] = 0;
            }

            if(!(ed48.getText().toString().equals(""))){
                symptoms_checklist_arr_base[11] = Integer.parseInt(ed48.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[11] = 0;
            }

            if(!(ed49.getText().toString().equals(""))){
                symptoms_checklist_arr_base[12] = Integer.parseInt(ed49.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[12] = 0;
            }

            if(!(ed50.getText().toString().equals(""))){
                symptoms_checklist_arr_base[13] = Integer.parseInt(ed50.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[13] = 0;
            }

            if(!(ed51.getText().toString().equals(""))){
                symptoms_checklist_arr_base[14] = Integer.parseInt(ed51.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[14] = 0;
            }

            if(!(ed52.getText().toString().equals(""))){
                symptoms_checklist_arr_base[15] = Integer.parseInt(ed52.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[15] = 0;
            }

            if(!(ed53.getText().toString().equals(""))){
                symptoms_checklist_arr_base[16] = Integer.parseInt(ed53.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[16] = 0;
            }

            if(!(ed54.getText().toString().equals(""))){
                symptoms_checklist_arr_base[17] = Integer.parseInt(ed54.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[17] = 0;
            }

            if(!(ed55.getText().toString().equals(""))){
                symptoms_checklist_arr_base[18] = Integer.parseInt(ed55.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[18] = 0;
            }

            if(!(ed56.getText().toString().equals(""))){
                symptoms_checklist_arr_base[19] = Integer.parseInt(ed56.getText().toString());
            }
            else{
                symptoms_checklist_arr_base[19] = 0;
            }

            int symptoms_checklist_arr_base_int = 0;
            for (int i = 0; i < 20; i++){
                symptoms_checklist_arr_base_int = symptoms_checklist_arr_base_int + symptoms_checklist_arr_base[i];
            }

            SharedPreferences.Editor editor = sharedpreferences.edit();

            editor.putInt("Symptoms Checklist Baseline", symptoms_checklist_arr_base_int);
            editor.commit();
            Toast.makeText(Symptoms_Checklist_Calibrate.this, "Thanks", Toast.LENGTH_LONG).show();


            Intent myIntent = new Intent(this, settings_page_activity.class);
            startActivity(myIntent);
        }
    }
}
