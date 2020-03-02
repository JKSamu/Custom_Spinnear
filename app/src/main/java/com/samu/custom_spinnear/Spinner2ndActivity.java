package com.samu.custom_spinnear;


import android.os.Bundle;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Spinner2ndActivity extends AppCompatActivity {

    String[] country = { "BD", "IN", "END"};
    String[] country2 = { "88018659569 ", "+88036841125", "+880123456789"};
    EditText edt;
    ListView listView;
    TextView tv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner2nd);

        Spinner spin = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, country);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);

        edt = (EditText) findViewById(R.id.edit_text);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    String value = country[position];
                    edt.setText(value);
                String value2 = country2[position];
                    tv.setText(value2);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        tv = (TextView) findViewById(R.id.textvw);
        Button button = (Button)findViewById(R.id.Btw);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(null);
                edt.setText(null);
            }
        });


        Spinner spin2 = (Spinner) findViewById(R.id.spinner2);
      ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, country2);
       adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
     spin2.setAdapter(adapter2);
      spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               String value2 = country2[position];
               tv.setText(value2);


         }

          @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
        });





    }






}
