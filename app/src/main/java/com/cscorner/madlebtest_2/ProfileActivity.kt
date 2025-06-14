package com.cscorner.madlebtest_2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile) // Ensure this file exists in res/layout

        // Ensure ic_home exists in your layout file
        val homeIcon: ImageView = findViewById(R.id.ic_home)
        val goalIcon: ImageView = findViewById(R.id.ic_goal)
        val settingsIcon: ImageView = findViewById(R.id.ic_settings)

        // Home icon click listener (Navigate to HomeActivity)
        homeIcon.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Optional: Close ProfileActivity to prevent going back
        }

        // Goal icon click listener (Navigate to GoalActivity)
        goalIcon.setOnClickListener {
            val intent = Intent(this, GoalActivity::class.java)
            startActivity(intent)
        }

        // Settings icon click listener (Navigate to SettingsActivity)
        settingsIcon.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}
