package com.udinn.syntaxin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class registrasi extends AppCompatActivity {
    private FirebaseAuth mAuth;
    EditText inputEmail, inputPassword;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mAuth = FirebaseAuth.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        inputEmail = findViewById(R.id.editTextTextEmail);
        inputPassword = findViewById(R.id.editTextTextPassword);
    }
    public void clickRegister(View view) {
        email = inputEmail.getText().toString();
        password = inputPassword.getText().toString();
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            startActivity(new Intent(registrasi.this, Login.class));
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(registrasi.this, "Daftar Gagal", Toast.LENGTH_SHORT).show();
                        }

                        // ...
                    }
                });
    }
}