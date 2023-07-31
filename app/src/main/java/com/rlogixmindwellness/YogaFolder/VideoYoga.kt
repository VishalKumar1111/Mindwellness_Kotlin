package com.rlogixmindwellness.YogaFolder

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.rlogixmindwellness.R

class VideoYoga : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_yoga)
        val videoView=findViewById<VideoView>(R.id.videoView)
        val mediacontroller=MediaController(this)
        mediacontroller.setAnchorView(videoView)
        val tposition=intent.getIntExtra("Position",0)

        when(tposition){
            0->{
                val offline:Uri=Uri.parse("android.resource://$packageName/${R.raw.test2}")

                videoView.setVideoURI(offline)

            }
            1->{
                val online:Uri = Uri.parse("android.resource://$packageName/${R.raw.test2}")
                videoView.setVideoURI(online)
            }
        }




        videoView.setMediaController(mediacontroller)

        videoView.resume()
        videoView.requestFocus()
        videoView.start()
    }
}