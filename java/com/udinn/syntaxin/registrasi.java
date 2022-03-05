package com.udinn.syntaxin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registrasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
    }
    public void clickregis(View view) {
        Intent i = new Intent(registrasi.this, Login.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(registrasi.this, Login.class);
        startActivity(i);
    }
}