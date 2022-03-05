package com.udinn.syntaxin;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detail_beasiswa extends AppCompatActivity {
    private ImageView img;
    private TextView tv_name, tv_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_beasiswa);
        img = findViewById(R.id.id_img_details);
        tv_name = findViewById(R.id.id_name_details);
        tv_email = findViewById(R.id.id_email_details);


        img.setImageResource(getIntent().getIntExtra("imagINTENT", R.drawable.loker1));
        tv_name.setText(getIntent().getStringExtra("nameINTENT"));
        tv_email.setText(getIntent().getStringExtra("emailINTENT"));
    }
}