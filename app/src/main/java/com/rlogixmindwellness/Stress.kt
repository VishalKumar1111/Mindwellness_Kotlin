package com.rlogixmindwellness

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class Stress : AppCompatActivity(),ViewpagerAdapter.MyclickListener {

    private var titleList= mutableListOf<String>("Stress","Mediataion","Yoga","Conncet To Doctor","Mental")
    private var discList= mutableListOf<String>("Stress","Mediataion","Yoga","Conncet To Doctor","Mental")
    private var imageList= mutableListOf<Int>(R.drawable.one,R.drawable.twelve,R.drawable.four,R.drawable.fifteen,R.drawable.six)
    private var topicimageList= mutableListOf<Int>(R.drawable.one,R.drawable.twelve,R.drawable.four,R.drawable.fifteen,R.drawable.six)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stress)

        postToList()

        val viewpager=findViewById<ViewPager2>(R.id.view_Pager2)
        viewpager.adapter=ViewpagerAdapter(titleList,discList,imageList,topicimageList,this)
        viewpager.orientation=ViewPager2.ORIENTATION_HORIZONTAL

    }

    private fun addToList(title:String,description : String ,images:Int,topic:Int){
        titleList.add(title)
        discList.add(description)
        imageList.add(images)
        topicimageList.add(topic)
    }

    private fun postToList(){

//
//        for (i in 1..5){
//            addToList("Title $i","Description $i", R.drawable.four,R.drawable.four)
//        }

    }

    override fun onClick(position: Int) {
        when(position){
            0 -> startActivity(Intent(this,Treatment::class.java))
        }

    }
}