package com.cscorner.madlebtest_2

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FruitsPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruitspage)

        // Find the back button and set the click listener
        val backButton: ImageView = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            // Finish the current activity and go back to the previous one
            finish()
        }
    }
}
