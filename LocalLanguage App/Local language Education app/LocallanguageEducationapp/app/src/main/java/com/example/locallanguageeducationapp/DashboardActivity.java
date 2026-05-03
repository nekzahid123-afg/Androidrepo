package com.example.locallanguageeducationapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // SAFE NAVIGATION: Computer Card
        View computerCard = findViewById(R.id.computerCard);
        if (computerCard != null) {
            computerCard.setOnClickListener(v -> 
                startActivity(new Intent(DashboardActivity.this, TextInputActivity.class))
            );
        }

        // SAFE NAVIGATION: Listening Card
        View listeningCard = findViewById(R.id.listeningCard);
        if (listeningCard != null) {
            listeningCard.setOnClickListener(v -> 
                startActivity(new Intent(DashboardActivity.this, VoiceInputActivity.class))
            );
        }

        // SAFE NAVIGATION: Bottom Bar
        BottomNavigationView bottomNav = findViewById(R.id.bottomNavMenu);
        if (bottomNav != null) {
            bottomNav.setOnItemSelectedListener(item -> {
                int id = item.getItemId();
                
                // Using exact IDs from our menu file to prevent crashes
                if (id == R.id.nav_home) {
                    return true;
                } else if (id == R.id.nav_vocabulary) {
                    startActivity(new Intent(this, HistoryActivity.class));
                    return true;
                } else if (id == R.id.nav_settings) {
                    startActivity(new Intent(this, SettingsActivity.class));
                    return true;
                } else if (id == R.id.nav_search) {
                    startActivity(new Intent(this, TextInputActivity.class));
                    return true;
                }
                return false;
            });
        }
    }
}