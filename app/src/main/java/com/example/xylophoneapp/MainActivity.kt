package com.example.xylophoneapp

import android.media.AudioAttributes
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    //var mediaPlayer = MediaPlayer.create(this, R.raw.xnote_g)
    val myUri: Uri = Uri.parse("http://google.com")
    val mediaPlayer = MediaPlayer().apply {
        setAudioAttributes(
            AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .build()
        )
        setDataSource(applicationContext, myUri)
        prepare()
        start()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val noteG: Button = findViewById(R.id.note_g)
        noteG.setOnClickListener { playSound(noteG)}
    }
    fun playSound(b: Button) {

    }
}