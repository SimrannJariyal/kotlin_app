package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var navigateButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        // Initialize the button
        navigateButton = findViewById(R.id.button_save)

        // Set the click listener
        navigateButton.setOnClickListener {
            // Create an Intent to start FirstActivity
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }
    }
}
