package com.rlogixmindwellness.StressFolder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.rlogixmindwellness.R
import com.rlogixmindwellness.R.id.gauge_text

class StressGauge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stress_gauge)

        val gauge_text: TextView =findViewById(gauge_text)

        val tscore=intent.getIntExtra("Score",0)

        gauge_text.text=tscore.toString()





    }
}