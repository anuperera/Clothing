package com.app.clothing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@Suppress("DEPRECATION")
class SplashScrean: AppCompatActivity() {

    private val Splashtime: Long by lazy { 3000 }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screan)

       Handler().postDelayed({
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        },Splashtime)

    }
}