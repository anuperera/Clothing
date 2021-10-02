package com.app.clothing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PreviousOrders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_previous_orders)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    //back button
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}