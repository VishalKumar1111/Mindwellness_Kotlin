package com.rlogixmindwellness.YogaFolder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rlogixmindwellness.R

class YogaAdapter(private var desc:ArrayList<RvItem>):RecyclerView.Adapter<YogaAdapter.ViewHolder>() {



    class ViewHolder(itemview:View):RecyclerView.ViewHolder(itemview) {
        var descImage=itemview.findViewById<ImageView>(R.id.item_imageView)
        var desctext=itemview.findViewById<TextView>(R.id.item_textview)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.yoga_items,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return desc.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem=desc[position]
        holder.descImage.setImageResource(currentItem.descImages)
        holder.desctext.text=currentItem.Description

    }
}