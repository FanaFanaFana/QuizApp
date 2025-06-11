package com.maral.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Startbildschirm der App – leitet bei Klick auf den Button zum Quiz weiter
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            val intent = Intent(this, QuizActivity::class.java)
            startActivity(intent)
        }
    }
}

