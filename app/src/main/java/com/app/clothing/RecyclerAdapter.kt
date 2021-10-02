package com.app.clothing

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var DressName = arrayOf("Short Blue Dress", "Brown Midi Dress", "Midi Dress Satin", "Satin Midi Dress - Gold",
        "Pink Midi Dress", " Sleeve Ruched Satin Mini Dress", "Sleeveless Fitted Pencil Dress Black", "Sleeveless Fitted Pencil Dress Blue", "Pink Wrap Sleeveless Pencil Dress", "Green Long Dress")
    private var DressCaption = arrayOf("Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.", "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.", "Caption Three",
        "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.", "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.", "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.", "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.", "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.",
        "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.", "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.")
    private var DressPrice = arrayOf("Rs. 2000.00", "Rs. 3000.00", "Rs. 3900.00",
        "Rs. 4000.00", "Rs. 4000.00", "Rs. 4200.00", "Rs. 4500.00", "Rs. 4800.00",
        "Rs. 5000.00", "Rs. 5500.00")
    private val LadyImage = intArrayOf(R.drawable.lady_1, R.drawable.lady_2, R.drawable.lady_3,
        R.drawable.lady_4, R.drawable.lady_5, R.drawable.lady_6, R.drawable.lady_7,
        R.drawable.lady_8, R.drawable.lady_9, R.drawable.lady_10)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = DressName[position]
        holder.itemDetail.text = DressCaption[position]
        holder.itemPrice.text = DressPrice[position]
        holder.itemImage.setImageResource(LadyImage[position])
    }

    override fun getItemCount(): Int {
        return DressName.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var itemPrice: TextView
        var addBtn: Button

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
            itemPrice = itemView.findViewById(R.id.item_price)
            addBtn = itemView.findViewById(R.id.add_Btn)

            addBtn.setOnClickListener {

                Toast.makeText(itemView.context, "Successfully added to cart", Toast.LENGTH_SHORT).show()

            }
        }


    }

}