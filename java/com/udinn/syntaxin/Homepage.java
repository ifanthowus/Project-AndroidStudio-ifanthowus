package com.udinn.syntaxin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }


    public void clickAbout(View view) {
        Intent i = new Intent(Homepage.this, About.class);
        startActivity(i);
    }

    public void clickView(View view) {
        Intent i = new Intent(Homepage.this, Loker_page.class);
        startActivity(i);
    }

    public void clickmessage(View view) {
        Intent i = new Intent(Homepage.this, massage.class);
        startActivity(i);
    }

    public void clickwebinar1(View view) {
        Intent i = new Intent(Homepage.this, webinar1.class);
        startActivity(i);
    }

    public void clickwebinar2(View view) {
        Intent i = new Intent(Homepage.this, webinar2.class);
        startActivity(i);
    }

    public void clickwebinar3(View view) {
        Intent i = new Intent(Homepage.this, webinar3.class);
        startActivity(i);
    }

    public void clickwebinar4(View view) {
        Intent i = new Intent(Homepage.this, webinar4.class);
        startActivity(i);
    }

    public void clickwebinar5(View view) {
        Intent i = new Intent(Homepage.this, webinar5.class);
        startActivity(i);
    }

    public void clickjobs1(View view) {
        Intent i = new Intent(Homepage.this, jobs1.class);
        startActivity(i);
    }

    public void clickjobs2(View view) {
        Intent i = new Intent(Homepage.this, jobs2.class);
        startActivity(i);
    }

    public void clickjobs3(View view) {
        Intent i = new Intent(Homepage.this, jobs3.class);
        startActivity(i);
    }

    public void clickjobs4(View view) {
        Intent i = new Intent(Homepage.this, jobs4.class);
        startActivity(i);
    }
}