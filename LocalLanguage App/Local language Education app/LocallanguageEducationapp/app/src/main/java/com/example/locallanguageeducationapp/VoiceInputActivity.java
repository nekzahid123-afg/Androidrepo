package com.example.locallanguageeducationapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.card.MaterialCardView;

/**
 * Voice Input Module: Converts spoken English into text.
 * Designed for accessibility and ease of use.
 */
public class VoiceInputActivity extends AppCompatActivity {

    private MaterialCardView micContainer;
    private TextView listeningStatusText, transcriptionPreview;
    private ImageView backBtn;
    private boolean isListening = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice_input);

        // Initialize UI components
        micContainer = findViewById(R.id.micContainer);
        listeningStatusText = findViewById(R.id.listeningStatusText);
        transcriptionPreview = findViewById(R.id.transcriptionPreview);
        backBtn = findViewById(R.id.backBtn);

        // 1. Back Button Logic
        backBtn.setOnClickListener(v -> finish());

        // 2. Microphone Click Logic (Start/Stop Toggle)
        micContainer.setOnClickListener(v -> {
            if (!isListening) {
                startListening();
            } else {
                stopListening();
            }
        });
    }

    private void startListening() {
        isListening = true;
        listeningStatusText.setVisibility(View.VISIBLE);
        transcriptionPreview.setText("Listening to your voice...");
        Toast.makeText(this, "کوم څه ووایاست...", Toast.LENGTH_SHORT).show();
        // Here we would normally start the Android SpeechRecognizer
    }

    private void stopListening() {
        isListening = false;
        listeningStatusText.setVisibility(View.INVISIBLE);
        transcriptionPreview.setText("Transcription complete. Processing your question...");
        // Here we would stop the recognizer and pass text to the next module
    }
}