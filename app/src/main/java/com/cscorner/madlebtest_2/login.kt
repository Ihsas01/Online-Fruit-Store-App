package com.cscorner.madlebtest_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signUpTextView: TextView = findViewById(R.id.tv_signup)
        val loginButton: Button = findViewById(R.id.btn_login)

        loginButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java)) // Navigates to login page (current activity)
        }

        signUpTextView.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java)) // Navigates to signup page
        }
    }
}
