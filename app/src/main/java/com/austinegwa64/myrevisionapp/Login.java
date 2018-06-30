package com.austinegwa64.myrevisionapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends Activity {

    TextView userName, password;
    Button btnLogin, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName = findViewById(R.id.userName);
        password = findViewById(R.id.pass);
        btnLogin= findViewById(R.id.login);
        btnSignup= findViewById(R.id.sign_up);

        final String user = userName.getText().toString();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startHome();
            }
        });


    }

    private void startHome() {
        Intent i = new Intent(this, Home.class);
        startActivity(i);
        finish();
    }

    }

