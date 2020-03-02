package com.samu.custom_spinnear;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Spinner1stActivity extends AppCompatActivity {

    String[] country = {"Samu","Somrat","Rahim","Karim","Samad","Fahad"};

    String[] country2 = {"+8801627384758","+8801928374657","+880182736495","+8801028384959","+8801928374657","+8801627384758"};

    EditText et,et2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner1st);

        Spinner spin = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        et = (EditText) findViewById(R.id.edit_text);
        et2 = (EditText) findViewById(R.id.edit_text2);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String value = country[position];
                et.setText(value);

                String value2 = country2[position];
                et2.setText(value2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
