package com.rlogixmindwellness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.viewpager2.widget.ViewPager2
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.one," Meditation is not what you think"))
        imageList.add(SlideModel(R.drawable.two,"Helping you To fight your Depression"))
        imageList.add(SlideModel(R.drawable.three,"Brilliant things happen in calm minds"))
        imageList.add(SlideModel(R.drawable.four,"A day thinking about what could happen, should happen, or what might have been is a day missed"))
        imageList.add(SlideModel(R.drawable.ten,"Distractions are everywhere. Notice what takes your attention, acknowledge it, and then let it go"))
        imageList.add(SlideModel(R.drawable.twelve,"To know one's own mind is nothing short of life-changing"))
        imageList.add(SlideModel(R.drawable.fifteen,"Look up and smile. But only if you feel like it"))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)


        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun onItemSelected(position: Int) {
                if (position==1){
                val intent=Intent(this@MainActivity,Stress::class.java)
                startActivity(intent)
                }
            }

            override fun doubleClick(position: Int) {
                if (position==0){
                    val intent=Intent(this@MainActivity,Stress::class.java)
                    startActivity(intent)
                }
            }
        })







    }



}