package com.udinn.syntaxin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboard);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(Onboard.this, Login.class);
        startActivity(i);
    }

    public void clickonboard(View view) {
        Intent i = new Intent(Onboard.this, onboard2.class);
        startActivity(i);
    }

    public void clicksign(View view) {
        Intent i = new Intent(Onboard.this, registrasi.class);
        startActivity(i);
    }
}