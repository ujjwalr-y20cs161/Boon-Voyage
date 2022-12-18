package com.example.ble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class fuel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuel);
        Intent intent5=new Intent(fuel.this, mechanic.class);
        startActivity(intent5);
    }
}