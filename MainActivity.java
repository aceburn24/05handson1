package com.example.a05handson;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText sw1,sw2;
    Button swap,check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//initialize layout
        sw1 = findViewById(R.id.sw1);
        sw2 = findViewById(R.id.sw2);
        check = findViewById(R.id.check);
        swap = findViewById(R.id.swap);
        swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = sw1.getText().toString();
                String s2 = sw2.getText().toString();
                sw1.setText(s2);
                sw2.setText(s1);
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s;
                String s1 = sw1.getText().toString();
                String s2 = sw2.getText().toString();
                if (s1.equals(s2))
                    s="SAME";
                else
                    s="NOT THE SAME";
                Intent intent = new Intent(MainActivity.this,ButtonPress.class);
                intent.putExtra("id",s);
                startActivity(intent);

            }
        });
    }

}