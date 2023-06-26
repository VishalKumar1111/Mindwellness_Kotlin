package com.rlogixmindwellness.StressFolder

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rlogixmindwellness.R

class Stress : AppCompatActivity(){
    private var score=0
    private var questionNo = 0
    private var questions= listOf(
        "What are the two official languages for Android development? ",
        "How do you define a function in Kotlin? ",
        "What is a variable used for? ",
        "What does SDK stand for in Android SDK? "
    )
    private var optnA= listOf("A)Kotlin and Java","A)void" ,"A)To contain data","A)Software Development Kit")
    private var optnB= listOf("B)Java and Python","B)var","B) To insert a random value","B) Software Development Kotlin")
    private var optnc= listOf("C) Kotlin and Python","C) function","C) Don't know","C) Something Don't Know")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stress)

        val button =findViewById<TextView>(R.id.option1)
        val button2=findViewById<TextView>(R.id.option_2)
        val button3=findViewById<TextView>(R.id.option3)


        button.setOnClickListener {
            showToast(1)
        }

        button2.setOnClickListener {
            showToast(2)
        }

        button3.setOnClickListener {
            showToast(3)
        }

    }


    private fun showToast(answer: Int) {
        when(answer){
            1->{
                updateQuestion()
                score+=10
            } 2->{
            updateQuestion()
            score+=15
        } 3->{
            updateQuestion()
            score+=20
        }
        }
        val toscore=score

    }

    private fun updateQuestion() {
        val textView:TextView =findViewById(R.id.textview)
        val button:TextView=findViewById(R.id.option1)
        val button2:TextView=findViewById(R.id.option_2)
        val button3:TextView=findViewById(R.id.option3)

        questionNo += 1
        textView.text = questions[questionNo]
        button2.text = optnB[questionNo]
        button3.text = optnc[questionNo]
        button.text = optnA[questionNo]

        if (questionNo==3){
            val intent= Intent(this,StressGauge::class.java)
                .putExtra("Score",score)
            startActivity(intent)
            Toast.makeText(this,"$score",Toast.LENGTH_SHORT).show()


        }
    }

}