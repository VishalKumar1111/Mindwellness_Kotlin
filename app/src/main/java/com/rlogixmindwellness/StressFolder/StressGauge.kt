package com.rlogixmindwellness.StressFolder

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.ekn.gruzer.gaugelibrary.HalfGauge
import com.ekn.gruzer.gaugelibrary.Range
import com.rlogixmindwellness.R
import com.rlogixmindwellness.R.id.gauge_text

class StressGauge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stress_gauge)

        val gauge_text: TextView =findViewById(gauge_text)
        val gauge=findViewById<HalfGauge>(R.id.halfGauge)
        val tscore=intent.getIntExtra("Score",0)




        val range = Range()
        range.color = Color.parseColor("#ce0000")
        range.from = 0.0
        range.to = 25.0

        val range2 = Range()
        range2.color = Color.parseColor("#E3E500")
        range2.from = 25.0
        range2.to = 50.0

        val range3 = Range()
        range3.color = Color.parseColor("#00b20b")
        range3.from = 50.0
        range3.to = 100.0

        //add color ranges to gauge
        gauge.addRange(range)
        gauge.addRange(range2)
        gauge.addRange(range3)

        //set min max and current value
        gauge.minValue = 0.0
        gauge.maxValue = 100.0
        gauge.value = 0.0

        gauge_text.text=tscore.toString()
        gauge.value=tscore.toString().toDouble()




    }
}