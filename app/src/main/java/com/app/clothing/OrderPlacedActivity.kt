package com.app.clothing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class OrderPlacedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_placed)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val op = findViewById<Button>(R.id.btn)
        // set on-click listener
        op.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
    //back button
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}