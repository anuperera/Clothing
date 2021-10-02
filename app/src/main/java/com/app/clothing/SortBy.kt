package com.app.clothing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class SortBy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sort_by)

        val radiobtn1 = findViewById<RadioButton>(R.id.radio_low_to_high)
        // set on-click listener
        radiobtn1.setOnClickListener {
            val intent = Intent(this, CostLow::class.java)
            startActivity(intent)
        }

        val radiobtn2 = findViewById<RadioButton>(R.id.radio_high_to_low)
        // set on-click listener
        radiobtn2.setOnClickListener {
            val intent = Intent(this, CostHigh::class.java)
            startActivity(intent)
        }

        val radiobtn3 = findViewById<RadioButton>(R.id.radio_rating)
        // set on-click listener
        radiobtn3.setOnClickListener {
            val intent = Intent(this, Rating::class.java)
            startActivity(intent)
        }
    }
}