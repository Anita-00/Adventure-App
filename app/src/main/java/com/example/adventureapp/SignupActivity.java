package com.example.adventureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // hide UI
        HideUI hideUI = new HideUI(getWindow());
    }
}