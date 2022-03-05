package com.udinn.syntaxin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class onboard2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard2);
    }

    public void clickonboard(View view) {
        Intent i = new Intent(onboard2.this, onboard3.class);
        startActivity(i);
    }
    public void clicksign(View view) {
        Intent i = new Intent(onboard2.this, registrasi.class);
        startActivity(i);
    }
}