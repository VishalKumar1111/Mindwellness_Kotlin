package com.rlogixmindwellness

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

/*class ViewpagerAdapter(private var title :List<String>,private var details : List<String>,private var images : List<Int>):RecyclerView.Adapter<ViewpagerAdapter.Pager2ViewHolder>(){
    inner class Pager2ViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){

        var itemTitle :TextView =itemview.findViewById(R.id.tvTitle)
        var itemDetails :TextView =itemview.findViewById(R.id.tvAbout)
        var itemImage :ImageView =itemview.findViewById(R.id.tv_image)

        init {
            itemImage.setOnClickListener {
                val position :Int =adapterPosition

                Toast.makeText(itemview.context,"You Clicked On item  ${position+1 }",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): ViewpagerAdapter.Pager2ViewHolder {
        return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_page,parent,false))
    }

    override fun onBindViewHolder(holder: ViewpagerAdapter.Pager2ViewHolder, position: Int) {
        holder.itemTitle.text=title[position]
        holder.itemDetails.text=title[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return title.size
    }


}
*/
