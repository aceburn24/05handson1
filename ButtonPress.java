package com.example.a05handson;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ButtonPress extends AppCompatActivity {
    String s1;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_press);//initialize layout file
        tv = findViewById(R.id.tvName);
        s1 = getIntent().getExtras().getString("id");
        tv.setText(s1);
    }


}