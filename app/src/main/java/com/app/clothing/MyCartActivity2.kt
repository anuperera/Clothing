package com.app.clothing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MyCartActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_cart2)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val po = findViewById<ImageButton>(R.id.imageView)
        // set on-click listener
        po.setOnClickListener {
            val intent = Intent(this, OrderPlacedActivity::class.java)
            startActivity(intent)
        }
    }


    //back button
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}