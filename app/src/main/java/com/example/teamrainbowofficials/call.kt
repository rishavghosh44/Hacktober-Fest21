package com.example.teamrainbowofficials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class call : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            val intent = Intent(this, response::class.java)
            startActivity(intent)
        }
        val button = findViewById<Button>(R.id.button9)
        button.setOnClickListener{
            val intent = Intent(this, Third::class.java)
            startActivity(intent)
        }
    }
}