package com.cscorner.madlebtest_2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable edge-to-edge display
        enableEdgeToEdge()

        // Set the layout for this activity
        setContentView(R.layout.activity_setting)

        // Adjust layout for system bars
        val mainView = findViewById<View>(R.id.main)
        mainView?.let {
            ViewCompat.setOnApplyWindowInsetsListener(it) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }

        // Logout button
        val logoutButton: Button = findViewById(R.id.btn_logout)
        logoutButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Close SettingsActivity after logging out
        }

        // Bottom navigation icons
        val homeIcon: ImageView = findViewById(R.id.ic_home)
        val goalIcon: ImageView = findViewById(R.id.ic_goal)
        val profileIcon: ImageView = findViewById(R.id.ic_profile)

        // Home navigation
        homeIcon.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Goal navigation
        goalIcon.setOnClickListener {
            val intent = Intent(this, GoalActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Profile navigation
        profileIcon.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Your Order navigation
        val yourOrders: LinearLayout = findViewById(R.id.your_orders)
        yourOrders.setOnClickListener {
            val intent = Intent(this, YourOrders::class.java) // Fixed class name
            startActivity(intent)
        }

        // Get Help navigation
        val getHelpMenu: LinearLayout = findViewById(R.id.get_help)
        getHelpMenu.setOnClickListener {
            val intent = Intent(this, GetHelp::class.java)
            startActivity(intent)
        }

        // About navigation
        val aboutMenu: LinearLayout = findViewById(R.id.about) // Get the "About" LinearLayout
        aboutMenu.setOnClickListener {
            // Start the About activity
            val intent = Intent(this, About::class.java)
            startActivity(intent)
        }
    }
}
