package com.cscorner.madlebtest_2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)  // Ensure this layout exists

        // Back Button
        val backButton: ImageView = findViewById(R.id.back_button)  // Ensure the button ID is correct

        backButton.setOnClickListener {
            // Navigate to the previous activity (finish the current activity)
            onBackPressed()
        }

        // Get reference to the "Next" button
        val nextButton: MaterialButton = findViewById(R.id.button_next)

        // Set the OnClickListener to navigate to CheckoutActivity when the button is clicked
        nextButton.setOnClickListener {
            // Create an Intent to go to CheckoutActivity
            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)  // Start the CheckoutActivity
        }
    }
}
