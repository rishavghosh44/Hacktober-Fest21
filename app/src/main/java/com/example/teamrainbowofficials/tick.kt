package com.example.teamrainbowofficials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tick : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tick)
        val button = findViewById<Button>(R.id.button9)
        button.setOnClickListener{
            val intent = Intent(this, Third::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button13)
        button2.setOnClickListener{
            val intent = Intent(this, send::class.java)
            startActivity(intent)
        }
    }
}