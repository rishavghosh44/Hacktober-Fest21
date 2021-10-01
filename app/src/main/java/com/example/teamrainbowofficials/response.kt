package com.example.teamrainbowofficials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class response : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_response)

        val button = findViewById<Button>(R.id.button9)
        button.setOnClickListener{
            val intent = Intent(this, Third::class.java)
            startActivity(intent)
        }

        val button12 = findViewById<Button>(R.id.button12)
        button12.setOnClickListener{
            val intent = Intent(this, fourth::class.java)
            startActivity(intent)
        }
    }
}