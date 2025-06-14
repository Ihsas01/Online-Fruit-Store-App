package com.cscorner.madlebtest_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CartPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cartpage)  // Ensure this is the correct layout file

        // Back Button
        val backButton: ImageView = findViewById(R.id.back_button)  // Ensure the button ID is correct

        backButton.setOnClickListener {
            // Navigate to the previous activity (finish the current activity)
            onBackPressed()
        }

        val checkOutButton: Button = findViewById(R.id.check_out_button)  // Ensure the button ID is correct

        checkOutButton.setOnClickListener {
            // Create an intent to navigate to the AddressPageActivity
            val intent = Intent(this, AddressPageActivity::class.java)
            startActivity(intent)
        }
    }
}
