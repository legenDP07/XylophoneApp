package com.example.xylophoneapp

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaPlayerG = MediaPlayer.create(this, R.raw.xnote_g)
        val mediaPlayerA = MediaPlayer.create(this, R.raw.xnote_a)
        val mediaPlayerB = MediaPlayer.create(this, R.raw.xnote_b)
        val mediaPlayerD = MediaPlayer.create(this, R.raw.xnote_d1)
        val mediaPlayerE = MediaPlayer.create(this, R.raw.xnote_e1)

        val noteG: Button = findViewById(R.id.note_g)
        noteG.setOnClickListener { mediaPlayerG.start() }

        val noteA: Button = findViewById(R.id.note_a)
        noteA.setOnClickListener { mediaPlayerA.start() }

        val noteB: Button = findViewById(R.id.note_b)
        noteB.setOnClickListener { mediaPlayerB.start() }

        val noteD: Button = findViewById(R.id.note_d)
        noteD.setOnClickListener { mediaPlayerD.start() }

        val noteE: Button = findViewById(R.id.note_e)
        noteE.setOnClickListener { mediaPlayerE.start() }

    }
}