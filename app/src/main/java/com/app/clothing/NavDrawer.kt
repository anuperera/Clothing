package com.app.clothing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class NavDrawer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_drawer)

        val faq = findViewById<ImageButton>(R.id.imageButton12)
        // set on-click listener
        faq.setOnClickListener {
            val intent = Intent(this, FAQ::class.java)
            startActivity(intent)
        }

        // To show back button in actionbar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val cart = findViewById<ImageButton>(R.id.imageButton14)
        // set on-click listener
        cart.setOnClickListener {
            val intent = Intent(this, MyCartActivity::class.java)
            startActivity(intent)
        }

        val order = findViewById<ImageButton>(R.id.imageButton11)
        // set on-click listener
        order.setOnClickListener {
            val intent = Intent(this, PreviousOrders::class.java)
            startActivity(intent)
        }

        val favouite = findViewById<ImageButton>(R.id.imageButton10)
        // set on-click listener
        favouite.setOnClickListener {
            val intent = Intent(this, AllStores::class.java)
            startActivity(intent)
        }

        val prof = findViewById<ImageButton>(R.id.imageButton9)
        // set on-click listener
        prof.setOnClickListener {
            val intent = Intent(this, MyProfile::class.java)
            startActivity(intent)
        }

        val profile = findViewById<ImageButton>(R.id.imageButton7)
        // set on-click listener
        profile.setOnClickListener {
            val intent = Intent(this, MyProfile::class.java)
            startActivity(intent)
        }

        val lo = findViewById<ImageButton>(R.id.imageButton13)
        // set on-click listener
        lo.setOnClickListener {
            val intent = Intent(this, LogoutActivity::class.java)
            startActivity(intent)
        }

        val mi = findViewById<ImageButton>(R.id.imageButton8)
        // set on-click listener
        mi.setOnClickListener {
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