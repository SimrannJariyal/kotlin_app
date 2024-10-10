package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity) // Set the layout for the splash screen

        // Show splash screen for 3 seconds (3000 ms)
        Handler(Looper.getMainLooper()).postDelayed({
            // After the delay, start MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Close SplashActivity
        }, 3000)  // 3 seconds delay
    }
}
