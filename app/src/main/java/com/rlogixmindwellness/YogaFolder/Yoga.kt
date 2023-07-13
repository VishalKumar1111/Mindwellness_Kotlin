package com.rlogixmindwellness.YogaFolder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rlogixmindwellness.R

class Yoga : AppCompatActivity() {
    private lateinit var yogaArray:ArrayList<RvItem>
    private lateinit var belowArray:ArrayList<RvItem>
    private lateinit var yogaAdapter:YogaAdapter
    private lateinit var belowAdapter:YogaAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga)

        val rvView:RecyclerView=findViewById(R.id.rvView)
        val rvbelow=findViewById<RecyclerView>(R.id.rvbelow)
        //rvView.layoutManager=LinearLayoutManager(this)
        rvView.layoutManager=LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)

        yogaArray=ArrayList()
        yogaArray.add(RvItem(R.drawable.three,"Hello"))
        yogaArray.add(RvItem(R.drawable.sixteen,"NEWS"))
        yogaArray.add(RvItem(R.drawable.six,"You ARE AWESOME"))
        yogaArray.add(RvItem(R.drawable.mindfull,"HWLLOEen"))
        yogaArray.add(RvItem(R.drawable.yog,"WHAT DOING"))


        yogaAdapter=YogaAdapter(yogaArray)
        rvView.adapter=yogaAdapter



        rvbelow.layoutManager=LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)

        belowArray=ArrayList()
        belowArray.add(RvItem(R.drawable.nine,"Hello"))
        belowArray.add(RvItem(R.drawable.ten,"Tomb"))
        belowArray.add(RvItem(R.drawable.seven,"Next"))
        belowArray.add(RvItem(R.drawable.seventeen,"Hello"))

        belowAdapter=YogaAdapter(belowArray)
        rvbelow.adapter=belowAdapter



    }
}