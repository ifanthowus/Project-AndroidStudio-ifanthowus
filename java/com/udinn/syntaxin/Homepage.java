package com.udinn.syntaxin;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Homepage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        //navbar
    }
    public void clickLogout(View view) {
        Intent i = new Intent(Homepage.this, Login.class);
        startActivity(i);
    }

    public void clickLoker(View view) {
        Intent i = new Intent(Homepage.this, Loker_page.class);
        startActivity(i);
    }

    public void clickBeasiswa(View view) {
        Intent i = new Intent(Homepage.this, Beasiswa_page.class);
        startActivity(i);
    }

    public void clickMagang(View view) {
        Intent i = new Intent(Homepage.this, Magang_page.class);
        startActivity(i);
    }

    public void clickAbout(View view) {
        Intent i = new Intent(Homepage.this, About.class);
        startActivity(i);
    }

    public void clickPLN(View view) {
        gotoUrl("https://web.pln.co.id/tentang-kami/profil-perusahaan");
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}