package com.rlogixmindwellness.YogaFolder

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rlogixmindwellness.R

class YogaAdapter(private var arrYoga:ArrayList<RvItemYoga>):RecyclerView.Adapter<YogaAdapter.Viewholder>() {
    class Viewholder( itemView: View):RecyclerView.ViewHolder(itemView) {
        var imgYoga = itemView.findViewById<ImageView>(R.id.img_ment_video)
        var Yogadesc = itemView.findViewById<TextView>(R.id.txt_video)
     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.video_mental_health,parent,false)
        return Viewholder(view)
    }

    override fun getItemCount(): Int {
        return arrYoga.size

    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {
        var currentitem= arrYoga[position]
        holder.imgYoga.setImageResource(currentitem.imageyoga)
        holder.Yogadesc.text = currentitem.txtyoga


    }
}