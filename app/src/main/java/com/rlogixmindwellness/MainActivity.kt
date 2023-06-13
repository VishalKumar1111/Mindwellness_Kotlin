package com.rlogixmindwellness

import android.content.ClipData.Item
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.iterator
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.AnimationTypes
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemChangeListener
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    private val imageTitle= mutableListOf("South Africa", "New York" , "USA", "Iceland","Stress","Yoga","Care")
    private val Title= mutableListOf("South Africa", "New York" , "USA", "Iceland","Stress","Yoga","Care")
    private val descTitle= arrayListOf("Benefits Of Yoga \n 1- Relief from depression and anxiety.\n2- Reduce the effects of PTSD and similar conditions\n 3- Boost concentration, focus, and memory \n  4- Improve your mood \n 5- Keep your brain young",
       " 1- Anxiety disorders.\n 2- Behavioural and emotional disorders in children.\n3- Bipolar affective disorder.\n4- Depression\n5- Addiction\n6- Psychosis","- Gaining a new perspective on stressful situations.\n 2- Building skills to manage your stress.  \n  3- Increasing self-awareness. \n  4- Focusing on the present. \n 5- Reducing negative emotions"
    ,"Counsellors work with clients experiencing a wide range of emotional and psychological difficulties to help them bring about effective change and/or enhance their wellbeing. Clients could have issues such as depression, anxiety, stress, loss and relationship difficulties that are affecting their ability to manage life.",
    "Calculate YOur Stress","Health","Calculate the Stress","Concern To Doctor")
    private var topicimageList= mutableListOf<Int>(R.drawable.one,R.drawable.twelve,R.drawable.four,R.drawable.fifteen,R.drawable.six,R.drawable.eleven,R.drawable.nine)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mainImage:ImageView=findViewById(R.id.main_image)
        val container=findViewById<ConstraintLayout>(R.id.constaint_lay)
        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        var nameTitle=findViewById<TextView>(R.id.name_title)
        val description=findViewById<TextView>(R.id.name_desciption)
        val title=findViewById<TextView>(R.id.title)


        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.one," Meditation is not what you think"))
        imageList.add(SlideModel(R.drawable.two,"Helping you To fight your Depression"))
        imageList.add(SlideModel(R.drawable.three,"Brilliant things happen in calm minds"))
        imageList.add(SlideModel(R.drawable.four,"A day thinking about what could happen, should happen, or what might have been is a day missed"))
        imageList.add(SlideModel(R.drawable.ten,"Distractions are everywhere. Notice what takes your attention, acknowledge it, and then let it go"))
        imageList.add(SlideModel(R.drawable.twelve,"To know one's own mind is nothing short of life-changing"))
        imageList.add(SlideModel(R.drawable.fifteen,"Look up and smile. But only if you feel like it"))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
        imageSlider.startSliding(3500)



        imageSlider.setItemChangeListener(object : ItemChangeListener{
            override fun onItemChanged(position: Int) {
                when(position){
                    0 -> title.text=Title[0]
                }

                for (i in 0 until topicimageList.size) {
                    mainImage.setImageResource(topicimageList[i])
                }

                nameTitle.text=imageTitle[position]
                container.setBackgroundColor(Color.parseColor(Colour.getColor()))
                description.text=descTitle[position]
                title.text=Title[position]


            }

        }
        )

        imageSlider.setSlideAnimation(AnimationTypes.ZOOM_OUT)



        imageSlider.setItemClickListener(object :ItemClickListener{
            override fun doubleClick(position: Int) {

            }

            override fun onItemSelected(position: Int) {
                if (position==1){
                    val intent=Intent(this@MainActivity,Stress::class.java)
                    startActivity(intent)

                    nameTitle.setOnClickListener {
                        startActivity((Intent(this@MainActivity,Stress::class.java))
                        )
                    }
                }


            }
        }
        )
//        imageSlider.setItemClickListener(object : ItemClickListener {
//          override fun onItemSelected(position: Int) {
//              if (position == 1) {
//                  nameTitle.text = "Stress"
//                  val intent = Intent(this@MainActivity, Stress::class.java)
//                  startActivity(intent)
//              }
//              fun onItemChanged(position: Int) {
//                  if (position == 1) {
//                      nameTitle.text = "STress"
//                  }
//              }
//
//              fun doubleClick(position: Int) {
//                  if (position == 0) {
//
//
//                      val intent = Intent(this@MainActivity, Stress::class.java)
//                      startActivity(intent)
//                  }
//              }
//          })

        }

}