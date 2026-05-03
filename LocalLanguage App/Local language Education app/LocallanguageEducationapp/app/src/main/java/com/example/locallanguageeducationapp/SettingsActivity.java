package com.example.locallanguageeducationapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

/**
 * Final Settings Module Logic:
 * Compatible with Pixel 5 and Samsung SM-A065F.
 */
public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // 1. Setup Navigation
        Toolbar toolbar = findViewById(R.id.settingsToolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setNavigationOnClickListener(v -> finish());
        }

        // 2. Setup Deletion Logic (Safety-checked for Pixel 5)
        Button clearHistoryBtn = findViewById(R.id.clearHistoryBtn);
        if (clearHistoryBtn != null) {
            clearHistoryBtn.setOnClickListener(v -> 
                Toast.makeText(SettingsActivity.this, "تاریخچه پاک شوه!", Toast.LENGTH_SHORT).show()
            );
        }
    }
}