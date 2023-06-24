package com.prankit.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // get data from intent
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");

        TextView intentText = findViewById(R.id.intentText);
        intentText.setText("id: " + id);
    }
}