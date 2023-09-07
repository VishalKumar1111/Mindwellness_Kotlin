package com.rlogixmindwellness.YogaFolder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rlogixmindwellness.MeditationFolder.MeditationAdapter
import com.rlogixmindwellness.MeditationFolder.RvItem
import com.rlogixmindwellness.R

class Yoga : AppCompatActivity() {
    private lateinit var belowArray:ArrayList<RvItemYoga>
    private lateinit var belowAdapter:YogaAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditation)


        val rvView: RecyclerView =findViewById(R.id.rv_yoga)
        rvView.layoutManager= LinearLayoutManager(this, RecyclerView.VERTICAL,false)

        belowArray=ArrayList()

        belowArray.add(RvItemYoga(R.drawable.sukhasana,"Sukhasana"))
        belowArray.add(RvItemYoga(R.drawable.ten,"Balasana"))
        belowArray.add(RvItemYoga(R.drawable.seven,"Adho Mukha Svanasana"))
        belowArray.add(RvItemYoga(R.drawable.seventeen,"Salamba Sarvangasana"))
        belowArray.add(RvItemYoga(R.drawable.seventeen,"Savasana"))



        belowAdapter= YogaAdapter(belowArray)
        rvView.adapter = belowAdapter


    }
}