package com.example.locallanguageeducationapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ExplanationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explanation);

        // Find the "Ask Another" button and make it work
        Button askAnotherBtn = findViewById(R.id.askAnotherBtn);
        if (askAnotherBtn != null) {
            askAnotherBtn.setOnClickListener(v -> finish());
        }

        // Find the "Save" button and show a toast
        Button saveBtn = findViewById(R.id.saveBtn);
        if (saveBtn != null) {
            saveBtn.setOnClickListener(v -> 
                Toast.makeText(this, "خوندي شو!", Toast.LENGTH_SHORT).show()
            );
        }
    }
}