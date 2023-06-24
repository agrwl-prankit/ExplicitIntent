package com.prankit.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button gotoSecondActivity = findViewById(R.id.gotoSecondActivityButton);
        gotoSecondActivity.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            // send data to another activity
            intent.putExtra("id", "from activity1");
            startActivity(intent);
        });
    }
}