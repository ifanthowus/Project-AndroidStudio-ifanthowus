package com.udinn.syntaxin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.L;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(Login.this, Homepage.class);
        startActivity(i);
    }

    public void clickregis(View view) {
        Intent i = new Intent(Login.this, registrasi.class);
        startActivity(i);
    }
}