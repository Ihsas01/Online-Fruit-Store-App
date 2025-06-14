package com.cscorner.madlebtest_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AddressPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addresspage)  // Make sure this layout exists


        // Back Button
        val backButton: ImageView = findViewById(R.id.back_button)  // Ensure the button ID is correct

        backButton.setOnClickListener {
            // Navigate to the previous activity (finish the current activity)
            onBackPressed()
        }

        // Get reference to the "Next" button
        val nextButton: Button = findViewById(R.id.button_next)

        // Set the OnClickListener to navigate to PaymentActivity when the button is clicked
        nextButton.setOnClickListener {
            // Create an Intent to go to the PaymentActivity
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)  // Start the PaymentActivity
        }
    }
}
