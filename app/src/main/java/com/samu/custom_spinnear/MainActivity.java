package com.samu.custom_spinnear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1,bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = (Button)findViewById(R.id.btw1);
        bt2 = (Button)findViewById(R.id.btw2);


    }

    public void goToSpinner1(View view) {
        Intent intent = new Intent(this, Spinner1stActivity.class);
        startActivity(intent);
    }
    public void goToSpinner2(View view) {
        Intent intent = new Intent(this, Spinner2ndActivity.class);
        startActivity(intent);
    }

}
