package com.example.ble;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class mechanic extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanic);
    }
}