package com.example.ble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    TextView t1;
    EditText ed1,ed2,ed3;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        t1=(TextView) findViewById(R.id.textView3);
        ed1=(EditText) findViewById(R.id.editTextTextPersonName2);
        ed2=(EditText) findViewById(R.id.editTextTextPersonName3);
        ed3=(EditText) findViewById(R.id.editTextTextPersonName4);
        b1=(Button) findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(signup.this,otp.class);
                startActivity(intent4);
            }
        });
    }
}