package com.app.clothing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val cart = findViewById<ImageButton>(R.id.imageButton2)
        // set on-click listener
        cart.setOnClickListener {
            val intent = Intent(this, MyCartActivity::class.java)
            startActivity(intent)
        }

        val all = findViewById<ImageButton>(R.id.imageButton15)
        // set on-click listener
        all.setOnClickListener {
            val intent = Intent(this, AllStores::class.java)
            startActivity(intent)
        }

        val pop = findViewById<ImageButton>(R.id.imageButton16)
        // set on-click listener
        pop.setOnClickListener {
            val intent = Intent(this, MimosaStore::class.java)
            startActivity(intent)
        }

        val pop1 = findViewById<ImageButton>(R.id.imageButton17)
        // set on-click listener
        pop1.setOnClickListener {
            val intent = Intent(this, NilsStoreActivity::class.java)
            startActivity(intent)
        }

        val pop2 = findViewById<ImageButton>(R.id.imageButton18)
        // set on-click listener
        pop2.setOnClickListener {
            val intent = Intent(this, NilsStoreActivity::class.java)
            startActivity(intent)
        }

        val kids = findViewById<ImageButton>(R.id.imageButton19)
        // set on-click listener
        kids.setOnClickListener {
            val intent = Intent(this, KidsStore::class.java)
            startActivity(intent)
        }

        val nav = findViewById<ImageButton>(R.id.imageButton)
        // set on-click listener
        nav.setOnClickListener {
            val intent = Intent(this, NavDrawer::class.java)
            startActivity(intent)
        }
    }



}