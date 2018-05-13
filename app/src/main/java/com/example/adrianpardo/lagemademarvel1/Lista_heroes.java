package com.example.adrianpardo.lagemademarvel1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Lista_heroes extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private String email, password;
    private EditText emailET, passwordET;
    private ImageButton ibLogin;
    FirebaseUser user;
    private boolean isBig = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_heroes);
    }
}
