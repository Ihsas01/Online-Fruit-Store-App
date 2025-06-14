package com.cscorner.madlebtest_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up) // Ensure activity_sign_up.xml exists

        // Initialize UI elements
        val btnBack: ImageView = findViewById(R.id.btn_back)
        val btnSignUp: Button = findViewById(R.id.btn_sign_in) // Button is labeled "Sign In" in XML
        val etName: EditText = findViewById(R.id.et_user_name)
        val etEmail: EditText = findViewById(R.id.et_email)
        val etPassword: EditText = findViewById(R.id.et_password)

        // Back button functionality
        btnBack.setOnClickListener {
            finish() // Close the SignUpActivity and return to previous screen
        }

        // Sign Up button click event
        btnSignUp.setOnClickListener {
            val name = etName.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                // Successful registration message
                Toast.makeText(this, "Sign Up Successful!", Toast.LENGTH_SHORT).show()

                // Navigate directly to HomeActivity after sign-up
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish() // Finish SignUpActivity so user can't go back
            }
        }
    }
}
