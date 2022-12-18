package com.example.ble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signin extends AppCompatActivity {
    Button b1;
    TextView et1;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        b1=(Button)findViewById(R.id.button3);
        et1=(TextView) findViewById(R.id.textView2);
        ed1=(EditText) findViewById(R.id.editTextTextPersonName);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(signin.this, fuel.class);
                startActivity(intent3);
            }
        });
    }
}