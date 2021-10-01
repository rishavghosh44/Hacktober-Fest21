package com.example.teamrainbowofficials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sixth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)

        val button = findViewById<Button>(R.id.button5)
        button.setOnClickListener{
            val intent = Intent(this, Third::class.java)
            startActivity(intent)
        }
        val button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener{
            val intent = Intent(this, eight::class.java)
            startActivity(intent)
        }
    }
}