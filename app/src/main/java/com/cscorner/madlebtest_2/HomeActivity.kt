package com.cscorner.madlebtest_2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Navigate to Settings Page
        val settingsIcon: ImageView = findViewById(R.id.ic_settings)
        settingsIcon.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        // Navigate to Goal Page
        val goalIcon: ImageView = findViewById(R.id.ic_goal)
        goalIcon.setOnClickListener {
            val intent = Intent(this, GoalActivity::class.java)
            startActivity(intent)
        }

        // Navigate to Profile Page
        val profileIcon: ImageView = findViewById(R.id.ic_profile)
        profileIcon.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        // Navigate to "See All Fruits" Page
        val seeAllFruits: TextView = findViewById(R.id.see_all_fruits)
        seeAllFruits.setOnClickListener {
            val intent = Intent(this, FruitsPageActivity::class.java)
            startActivity(intent)
        }

        // Navigate to Cart Page
        val cartIcon: ImageView = findViewById(R.id.ic_cart)
        cartIcon.setOnClickListener {
            val intent = Intent(this, CartPageActivity::class.java)
            startActivity(intent)
        }

        // Navigate to Apple Page
        val appleImage: ImageView = findViewById(R.id.ic_apple)
        appleImage.setOnClickListener {
            val intent = Intent(this, ApplePageActivity::class.java)
            startActivity(intent)
        }
    }
}
