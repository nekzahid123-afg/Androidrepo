package com.example.locallanguageeducationapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Text Input Module: Allows students to type English questions.
 */
public class TextInputActivity extends AppCompatActivity {

    private EditText questionInputField;
    private ImageView clearTextBtn, backBtn;
    private Button getExplanationBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input);

        questionInputField = findViewById(R.id.questionInputField);
        clearTextBtn = findViewById(R.id.clearTextBtn);
        backBtn = findViewById(R.id.backBtn);
        getExplanationBtn = findViewById(R.id.getExplanationBtn);

        clearTextBtn.setOnClickListener(v -> questionInputField.setText(""));
        backBtn.setOnClickListener(v -> finish());

        // NAVIGATION: Move to Explanation Screen on Submit
        getExplanationBtn.setOnClickListener(v -> {
            String question = questionInputField.getText().toString().trim();
            if (question.isEmpty()) {
                Toast.makeText(this, "مهرباني وکړئ خپله پوښتنه ولیکئ", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(this, ExplanationActivity.class);
                startActivity(intent);
            }
        });
    }
}