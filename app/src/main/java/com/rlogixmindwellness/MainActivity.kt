package com.rlogixmindwellness

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.AnimationTypes
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemChangeListener
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {

    private val imageTitle= mutableListOf("How This App Can Help You", "Calculate Your Stress" , "Yoga & Benifits", "Mental Health problem","Meditation","Concern To Doctor")
    private val Title= mutableListOf("How This App Can Help You", "Calculate Your Stress" , "Yoga & Benifits", "Mental Health problem","Meditation","Concern To Doctor")
    private val descTitle= arrayListOf("Benefits Of Yoga \n 1- Relief from depression and anxiety.\n2- Reduce the effects of PTSD and similar conditions\n 3- Boost concentration, focus, and memory \n  4- Improve your mood \n 5- Keep your brain young",
       " 1- Anxiety disorders.\n 2- Behavioural and emotional disorders in children.\n3- Bipolar affective disorder.\n4- Depression\n5- Addiction\n6- Psychosis","- Gaining a new perspective on stressful situations.\n 2- Building skills to manage your stress.  \n  3- Increasing self-awareness. \n  4- Focusing on the present. \n 5- Reducing negative emotions"
    ,"Counsellors work with clients experiencing a wide range of emotional and psychological difficulties to help them bring about effective change and/or enhance their wellbeing. Clients could have issues such as depression, anxiety, stress, loss and relationship difficulties that are affecting their ability to manage life.",
    "Calculate YOur Stress","Health","Concern To Doctor")
    private var topicimageList= mutableListOf(
        R.drawable.helpapp,
        R.drawable.twelve,
        R.drawable.yog,
        R.drawable.mentalhealth,
        R.drawable.meditation,
        R.drawable.doctor,
    )


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainImage:ImageView=findViewById(R.id.main_image)
        val container=findViewById<ConstraintLayout>(R.id.constaint_lay)
        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        val nameTitle=findViewById<TextView>(R.id.name_title)
        val description=findViewById<TextView>(R.id.name_desciption)
        val title=findViewById<TextView>(R.id.title)

        title.text="How this App Can Help You"
        title.setOnClickListener { startActivity(Intent(this@MainActivity,Stress::class.java)) }
        description.text="Benefits Of Yoga \n 1- Relief from depression and anxiety.\n2- Reduce the effects of PTSD and similar conditions\n 3- Boost concentration, focus, and memory \n  4- Improve your mood \n 5- Keep your brain young\n"
        mainImage.setImageResource(R.drawable.helpapp)
        nameTitle.text="How this App Can Help You"


        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.helpapp))
        imageList.add(SlideModel(R.drawable.twelve))
        imageList.add(SlideModel(R.drawable.yog))
        imageList.add(SlideModel(R.drawable.mentalhealth))
        imageList.add(SlideModel(R.drawable.meditation))
        imageList.add(SlideModel(R.drawable.doctor))


        imageSlider.setImageList(imageList, ScaleTypes.FIT)
        imageSlider.startSliding(1500)




        imageSlider.setItemChangeListener(object : ItemChangeListener{
            override fun onItemChanged(position: Int) {

                if (position==0){
                    title.text=Title[0]
                    title.setOnClickListener {
                        startActivity(Intent(this@MainActivity, Stress::class.java))}
                    description.text=descTitle[0]
                    mainImage.setImageResource(topicimageList[0])
                    mainImage.setOnClickListener {startActivity(Intent(this@MainActivity, Treatment::class.java)) }
                    nameTitle.text=imageTitle[0]
                }

                if (position==1){
                    title.text=Title[1]
                    title.setOnClickListener {
                        startActivity(
                            Intent(this@MainActivity, Stress::class.java))
                    }
                    description.text=descTitle[1]
                    mainImage.setImageResource(topicimageList[1])
                    mainImage.setOnClickListener {startActivity(Intent(this@MainActivity, Treatment::class.java))
                    }
                    nameTitle.text=imageTitle[1]
                }

                if (position==2) {
                    title.text = Title[2]
                    title.setOnClickListener {
                        startActivity(Intent(this@MainActivity, Treatment::class.java)) }
                    description.text=descTitle[2]
                    mainImage.setImageResource(topicimageList[2])
                    mainImage.setOnClickListener {startActivity(Intent(this@MainActivity, Stress::class.java)) }
                    nameTitle.text=imageTitle[2]
                }
                if (position==3) {
                    title.text = Title[3]
                    title.setOnClickListener {
                        startActivity(Intent(this@MainActivity, Treatment::class.java))
                    }
                    description.text=descTitle[3]
                    mainImage.setImageResource(topicimageList[3])
                    mainImage.setOnClickListener {startActivity(Intent(this@MainActivity, Stress::class.java)) }
                    nameTitle.text=imageTitle[3]
                }
                if (position==4) {
                    title.text = Title[4]
                    title.setOnClickListener {startActivity(Intent(this@MainActivity, Treatment::class.java))
                    }
                    description.text = descTitle[4]
                    description.setOnClickListener { startActivity(Intent(this@MainActivity,Stress::class.java)) }
                    mainImage.setImageResource(topicimageList[4])
                    mainImage.setOnClickListener {startActivity(Intent(this@MainActivity, Stress::class.java)) }
                    nameTitle.text=imageTitle[4]
                }

                 if (position==5){
                     title.text=Title[5]
                     title.setOnClickListener {startActivity(Intent(this@MainActivity, Treatment::class.java))
                     }
                     description.text = descTitle[5]
                     description.setOnClickListener { startActivity(Intent(this@MainActivity,Stress::class.java)) }

                     nameTitle.setOnClickListener { startActivity(Intent(this@MainActivity,Stress::class.java)) }
                     mainImage.setImageResource(topicimageList[5])
                     mainImage.setOnClickListener {startActivity(Intent(this@MainActivity, Stress::class.java)) }
                     nameTitle.text=imageTitle[5]

                 }



             //   mainImage.setImageResource(topicimageList[position])
//                nameTitle.text=imageTitle[position]
                container.setBackgroundColor(Color.parseColor(Colour.getColor()))
            //  description.text=descTitle[position]
           //     title.text=Title[position]





            }

        }
        )

        imageSlider.setSlideAnimation(AnimationTypes.ROTATE_UP)



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