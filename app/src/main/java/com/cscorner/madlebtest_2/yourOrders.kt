package com.cscorner.madlebtest_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class YourOrders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_yourorder)

        // Back button to go to the previous page
        findViewById<ImageView>(R.id.back_button).setOnClickListener {
            onBackPressedDispatcher.onBackPressed() // This goes back to the previous page
        }

        // Navigate to CurrentOrder page
        findViewById<Button>(R.id.current_order_button).setOnClickListener {
            val intent = Intent(this, CurrentOrder::class.java)
            startActivity(intent)
        }

        // Navigate to TrackOrder page
        findViewById<Button>(R.id.track_order_button).setOnClickListener {
            val intent = Intent(this, TrackOrder::class.java)
            startActivity(intent)
        }

        // Navigate to OrderHistory page
        findViewById<Button>(R.id.order_history_button).setOnClickListener {
            val intent = Intent(this, OrderHistory::class.java)
            startActivity(intent)
        }
    }
}
