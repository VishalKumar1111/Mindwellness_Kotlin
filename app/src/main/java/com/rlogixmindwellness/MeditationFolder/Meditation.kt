package com.rlogixmindwellness.MeditationFolder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rlogixmindwellness.R

class Meditation : AppCompatActivity() {
    private lateinit var yogaArray:ArrayList<RvItem>
    private lateinit var belowArray:ArrayList<RvItem>
    private lateinit var meditationAdapter:MeditationAdapter
    private lateinit var belowAdapter:MeditationAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga)

        supportActionBar?.hide()
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


        meditationAdapter=MeditationAdapter(yogaArray)
        rvView.adapter=meditationAdapter

        meditationAdapter.setOnItemClickListener(object :MeditationAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(this@Meditation,"Clicked on the $position",Toast.LENGTH_SHORT).show()

                val intent=Intent(this@Meditation, VideoMeditation::class.java)
                    .putExtra("Position",position)
                startActivity(intent)

//                when(position){
//                    0-> {
//                       // startActivity(Intent(this@Yoga, VideoYoga::class.java))
//                        val intent=Intent(this@Yoga, VideoYoga::class.java)
//                            .putExtra("Position",position)
//                        startActivity(intent)
//                    }
//
//
//
//                }
            }

        })



        rvbelow.layoutManager=LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)

        belowArray=ArrayList()
        belowArray.add(RvItem(R.drawable.nine,"Hello"))
        belowArray.add(RvItem(R.drawable.ten,"Tomb"))
        belowArray.add(RvItem(R.drawable.seven,"Next"))
        belowArray.add(RvItem(R.drawable.seventeen,"Hello"))



        belowAdapter=MeditationAdapter(belowArray)
        rvbelow.adapter=belowAdapter
        belowAdapter.setOnItemClickListener(object :MeditationAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(this@Meditation,"Clicked on the $position",Toast.LENGTH_SHORT).show()
            }
        })



    }
}