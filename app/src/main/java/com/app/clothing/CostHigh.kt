package com.app.clothing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class CostHigh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cost_high)

        val filter = findViewById<ImageButton>(R.id.imageButton2)
        // set on-click listener
        filter.setOnClickListener {
            val intent = Intent(this, SortBy::class.java)
            startActivity(intent)
        }

        val nav = findViewById<ImageButton>(R.id.imageButton)
        // set on-click listener
        nav.setOnClickListener {
            val intent = Intent(this, NavDrawer::class.java)
            startActivity(intent)
        }

        val nil = findViewById<ImageButton>(R.id.imageButton4)
        // set on-click listener
        nil.setOnClickListener {
            val intent = Intent(this, NilsStoreActivity::class.java)
            startActivity(intent)
        }

        val mimosa = findViewById<ImageButton>(R.id.imageButton3)
        // set on-click listener
        mimosa.setOnClickListener {
            val intent = Intent(this, MimosaStore::class.java)
            startActivity(intent)
        }
        val op = findViewById<ImageButton>(R.id.imageButton5)
        // set on-click listener
        op.setOnClickListener {
            val intent = Intent(this, NilsStoreActivity::class.java)
            startActivity(intent)
        }

        val mim = findViewById<ImageButton>(R.id.imageButton6)
        // set on-click listener
        mim.setOnClickListener {
            val intent = Intent(this, MimosaStore::class.java)
            startActivity(intent)
        }

    }
}