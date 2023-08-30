package com.rlogixmindwellness.MentalHealth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rlogixmindwellness.R
import com.rlogixmindwellness.YogaFolder.VideoYoga
import com.rlogixmindwellness.YogaFolder.YogaAdapter

class MentalHealth : AppCompatActivity() {
    private lateinit var mentalArray :ArrayList<MenRvItem>
    private lateinit var mentalAdapter: MentalHealthAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditation)
        val rvMental = findViewById<RecyclerView>(R.id.rv_mental)
        rvMental.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)

        mentalArray= ArrayList()
        mentalArray.add(MenRvItem("Depression","Label",R.drawable.twelve))
        mentalArray.add(MenRvItem("Anxiety","Label",R.drawable.thirteen))
        mentalArray.add(MenRvItem("Addiction","Label",R.drawable.one))
        mentalArray.add(MenRvItem("Psychosis","Label",R.drawable.one))
        mentalArray.add(MenRvItem("Bipolar Disorder","Label",R.drawable.one))
        mentalArray.add(MenRvItem("Other psychological Disorder","Label",R.drawable.one))

        mentalAdapter= MentalHealthAdapter(mentalArray)
        rvMental.adapter= mentalAdapter

        mentalAdapter.setOnItemClickListener(object : MentalHealthAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(this@MentalHealth, "Clicked on the $position", Toast.LENGTH_SHORT).show()

                val intent = Intent(this@MentalHealth, VideoYoga::class.java)
                    .putExtra("Position", position)
                startActivity(intent)

//                when(position){
//                    0-> {
//                       // startActivity(Intent(this@Yoga, VideoYoga::class.java))
//                        val intent=Intent(this@Yoga, VideoYoga::class.java)
//                            .putExtra("Position",position)
//                        startActivity(intent)
//                    }

            }

        })




    }
}