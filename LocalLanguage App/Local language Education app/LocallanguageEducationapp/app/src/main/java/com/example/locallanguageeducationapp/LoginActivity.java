package com.example.locallanguageeducationapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText emailInput, passwordInput;
    private Button loginBtn;
    private TextView signupLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);
        loginBtn = findViewById(R.id.loginBtn);
        signupLink = findViewById(R.id.signupLink);

        // LOGIN LOGIC
        loginBtn.setOnClickListener(v -> {
            String inputEmail = emailInput.getText().toString().trim();
            String inputPass = passwordInput.getText().toString().trim();

            // Retrieve saved credentials
            SharedPreferences sharedPref = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE);
            String savedEmail = sharedPref.getString("saved_email", "");
            String savedPass = sharedPref.getString("saved_password", "");

            if (inputEmail.isEmpty() || inputPass.isEmpty()) {
                Toast.makeText(this, "Please enter all details", Toast.LENGTH_SHORT).show();
            } 
            // CHECKING IF THEY MATCH
            else if (inputEmail.equals(savedEmail) && inputPass.equals(savedPass)) {
                Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
                finish(); // Close login
            } else {
                Toast.makeText(this, "Invalid Email or Password. Please Register first.", Toast.LENGTH_LONG).show();
            }
        });

        // LINK TO SIGNUP
        signupLink.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, SignupActivity.class));
        });
    }
}