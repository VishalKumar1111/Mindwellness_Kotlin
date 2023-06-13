package com.rlogixmindwellness

object NaTitle {
    val nameTitle = arrayOf(
        "Stress",
        "Meditation",
        "HeathCare",
        "Know Your Stress",
        "Yoga",
        "Concern To Doctor"
    )
    var nameTitleIndex = 1
    fun getname(): String {
        return Colour.color[nameTitleIndex++ % nameTitle.size]
    }
}