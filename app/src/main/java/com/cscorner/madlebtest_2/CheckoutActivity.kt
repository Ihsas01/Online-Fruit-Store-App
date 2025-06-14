package com.cscorner.madlebtest_2

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CheckoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)  // Ensure this layout exists
        // Back Button
        val backButton: ImageView = findViewById(R.id.back_button)  // Ensure the button ID is correct

        backButton.setOnClickListener {
            // Navigate to the previous activity (finish the current activity)
            onBackPressed()
        }

    }
}