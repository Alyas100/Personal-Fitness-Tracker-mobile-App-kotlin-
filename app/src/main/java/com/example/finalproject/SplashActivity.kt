package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash) // Custom splash screen layout

        // Delay the splash screen (2 seconds)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, WelcomeScreen::class.java))
            finish() // Close splash screen after switching
        }, 2000) // Adjust delay time as needed
    }
}
