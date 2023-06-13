package com.rlogixmindwellness

object Colour {
    val color = arrayOf("#3EB9DF", "#3685BC", "#D36280", "#E44F55", "#FA8056", "#8188CA")
    var colourIndex = 1
    fun getColor(): String {

        return color[colourIndex++ % color.size]

    }


}


