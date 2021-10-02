package com.app.clothing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MimosaStore : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<MimosaAdapter.ViewHolder>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mimosa_store)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val recycler_view = findViewById<RecyclerView>(R.id.recyclerView1)

        layoutManager = LinearLayoutManager(this)

        recycler_view.layoutManager = layoutManager

        adapter = MimosaAdapter()
        recycler_view.adapter = adapter
    }

    //back button
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}