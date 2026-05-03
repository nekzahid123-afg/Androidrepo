package com.example.locallanguageeducationapp;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.tabs.TabLayout;

/**
 * History & Saved Module:
 * Displays a list of past searches and starred educational content.
 */
public class HistoryActivity extends AppCompatActivity {

    private ImageView backBtn;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        // Initialize components
        backBtn = findViewById(R.id.historyBackBtn);
        tabLayout = findViewById(R.id.historyTabs);

        // 1. Back button logic
        backBtn.setOnClickListener(v -> finish());

        // 2. Tab switching logic (Basic implementation for UI demo)
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // In Phase 2, this will filter the RecyclerView list
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });
    }
}