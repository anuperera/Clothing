package com.app.clothing

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class KidsAdapter: RecyclerView.Adapter<KidsAdapter.ViewHolder>() {

    private var DressName = arrayOf("Short Blue Dress", "Brown Midi Dress", "Midi Dress Satin", "Satin Midi Dress - Gold",
        "Pink Midi Dress", " Sleeve Ruched Satin Mini Dress", "Sleeveless Fitted Pencil Dress Black", "Sleeveless Fitted Pencil Dress Blue", "Pink Wrap Sleeveless Pencil Dress", "Green Long Dress")
    private var DressCaption = arrayOf("Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.", "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.", "Caption Three",
        "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.", "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.", "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.", "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.", "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.",
        "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.", "Meet Nils, a newbie this season... Both comfortable and elegant: so easy to wear.")
    private var DressPrice = arrayOf("Rs. 2000.00", "Rs. 3000.00", "Rs. 3900.00",
        "Rs. 4000.00", "Rs. 4000.00", "Rs. 4200.00", "Rs. 4500.00", "Rs. 4800.00",
        "Rs. 5000.00", "Rs. 5500.00")
    private val LadyImage = intArrayOf(R.drawable.kid1, R.drawable.kid2, R.drawable.kid3,
        R.drawable.kid4, R.drawable.kid5, R.drawable.kid6, R.drawable.kid7,
        R.drawable.kid8, R.drawable.kid9, R.drawable.kid10)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KidsAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card3, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: KidsAdapter.ViewHolder, position: Int) {
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
            itemImage = itemView.findViewById(R.id.item_image2)
            itemTitle = itemView.findViewById(R.id.item_title2)
            itemDetail = itemView.findViewById(R.id.item_detail2)
            itemPrice = itemView.findViewById(R.id.item_price2)
            addBtn = itemView.findViewById(R.id.add_Btn2)

            addBtn.setOnClickListener {

                Toast.makeText(itemView.context, "Successfully added to cart", Toast.LENGTH_SHORT).show()

            }
        }


    }

}