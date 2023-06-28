package com.rlogixmindwellness

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rlogixmindwellness.StressFolder.StressGauge


class Treatment : AppCompatActivity() {
    private lateinit var questionTextView: TextView
    private lateinit var option1Button: Button
    private lateinit var option2Button: Button
    private lateinit var option3Button: Button
    private lateinit var option4Button: Button

    private var currentQuestionIndex = 0
    private var score = 0

    private val questions = listOf(
        Question("What is the capital of France?", listOf("Paris", "London", "Rome", "Berlin"), 0),
        Question("Which planet is known as the Red Planet?", listOf("Mars", "Venus", "Jupiter", "Saturn"), 0),
        Question("What is the largest ocean on Earth?", listOf("Pacific Ocean", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean"), 0),
        Question("What is the chemical symbol for gold?", listOf("Au", "Ag", "Fe", "Cu"), 0),
        Question("Who painted the Mona Lisa?", listOf("Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Michelangelo"), 0)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treatment)
        questionTextView = findViewById(R.id.questionTextView)
        option1Button = findViewById(R.id.option1Button)
        option2Button = findViewById(R.id.option2Button)
        option3Button = findViewById(R.id.option3Button)
        option4Button = findViewById(R.id.option4Button)

        displayQuestion()

        option1Button.setOnClickListener { checkAnswer(0) }
        option2Button.setOnClickListener { checkAnswer(1) }
        option3Button.setOnClickListener { checkAnswer(2) }
        option4Button.setOnClickListener { checkAnswer(3) }
    }

    private fun displayQuestion() {
        val currentQuestion = questions[currentQuestionIndex]
        questionTextView.text = currentQuestion.question
        option1Button.text = currentQuestion.options[0]
        option2Button.text = currentQuestion.options[1]
        option3Button.text = currentQuestion.options[2]
        option4Button.text = currentQuestion.options[3]
    }

    private fun checkAnswer(selectedOptionIndex: Int) {
        val currentQuestion = questions[currentQuestionIndex]

        if(selectedOptionIndex==0){
            score+=5
        }
        if(selectedOptionIndex==1){
            score+=10
        }
        if(selectedOptionIndex==2){
            score+=25
        }
        if(selectedOptionIndex==3){
            score+=20
        }


        currentQuestionIndex++
        if (currentQuestionIndex < questions.size) {
            displayQuestion()
        } else {
            showFinalScore()
        }

    }

    private fun showFinalScore() {
        val intent=Intent(this@Treatment,StressGauge::class.java)
            .putExtra("Score",score)
        startActivity(intent)
        Toast.makeText(this, "Final Score: $score", Toast.LENGTH_LONG).show()
        // You can perform additional actions here, such as restarting the quiz.
    }
}

data class Question(val question: String, val options: List<String>, val correctAnswerIndex: Int)

