package com.example.adventureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// sign up screen

public class MainActivity extends AppCompatActivity {

    TextView signup;
    Context context;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set the context
        context = this;

        // find the UI ids
        signup = findViewById(R.id.signUpLink);
        login = findViewById(R.id.loginButton);

        // underline the sign up text
        signup.setPaintFlags(signup.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        HideUI hideUI = new HideUI(getWindow());

        // listens to if sign up link is clicked
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // gets redirected to sign up page
                Intent intent = new Intent( context, SignupActivity.class);
                startActivity(intent);
            }
        });

        // listen if sign up button is clicked
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // VALIDATE USER FIRST

                Intent intent = new Intent( context, MainScreenActivity.class);
                startActivity(intent);
            }
        });

    }
}