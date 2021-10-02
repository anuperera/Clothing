package com.app.clothing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KidsStore : AppCompatActivity() {
private var layoutManager: RecyclerView.LayoutManager? = null
private var adapter: RecyclerView.Adapter<KidsAdapter.ViewHolder>? = null

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    supportActionBar?.setDisplayHomeAsUpEnabled(true)
    setContentView(R.layout.kids_store)

    val recycler_view = findViewById<RecyclerView>(R.id.recyclerView2)

    layoutManager = LinearLayoutManager(this)

    recycler_view.layoutManager = layoutManager

    adapter = KidsAdapter()
    recycler_view.adapter = adapter


}
//back button
override fun onSupportNavigateUp(): Boolean {
    onBackPressed()
    return true
}
}
