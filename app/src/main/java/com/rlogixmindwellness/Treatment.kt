package com.rlogixmindwellness

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class Treatment : AppCompatActivity() {
    private val images = arrayListOf(R.drawable.one, R.drawable.two, R.drawable.three)
    private val imageTitle = arrayListOf("Cape Town, South Africa", "New York, USA", "Iceland")
    val imageDesc = arrayListOf("Broad walk by the ocean", "Journal and coffee at table", "Tying down tent fly")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treatment)

//        val carouselView = findViewById<CarouselView>(R.id.carousel)
//
//
//
//        carouselView.apply {
//            size= images.size
//            resource = R.layout.image_carousel
//            autoPlay = true
//            indicatorAnimationType = IndicatorAnimationType.THIN_WORM
//            carouselOffset = OffsetType.CENTER
//            setCarouselViewListener { view, position ->
//                // Example here is setting up a full image carousel
//                val imageView = view.findViewById<ImageView>(R.id.imageView)
//                imageView.setImageDrawable(resources.getDrawable(images[position]))
//            }
//            // After you finish setting up, show the CarouselView
//            show()
//        }
    }
}