package com.udinn.syntaxin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        //navbar
    }
    public void click1(View view) {
        Intent i = new Intent(About.this, Biodata.class);
        startActivity(i);
    }

    public void click2(View view) {
        Intent i = new Intent(About.this, Biodata2.class);
        startActivity(i);
    }

    public void click3(View view) {
        Intent i = new Intent(About.this, Biodata3.class);
        startActivity(i);
    }

    public void click4(View view) {
        Intent i = new Intent(About.this, Biodata4.class);
        startActivity(i);
    }

    public void click5(View view) {
        Intent i = new Intent(About.this, Biodata5.class);
        startActivity(i);
    }
}