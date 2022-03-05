package com.udinn.syntaxin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class onboard3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard3);
    }

    public void clicksign(View view) {
        Intent i = new Intent(onboard3.this, registrasi.class);
        startActivity(i);
    }

    public void clickonboard3(View view) {
        Intent i = new Intent(onboard3.this, Login.class);
        startActivity(i);
    }
}