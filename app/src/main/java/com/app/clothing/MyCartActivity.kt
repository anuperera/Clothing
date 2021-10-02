package com.app.clothing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class MyCartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_cart)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val imageDelete = findViewById<ImageView>(R.id.minus_image)

        imageDelete.setOnClickListener{

            Toast.makeText(this, "Item Removed", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MyCartActivity2::class.java)
            startActivity(intent)
        }

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