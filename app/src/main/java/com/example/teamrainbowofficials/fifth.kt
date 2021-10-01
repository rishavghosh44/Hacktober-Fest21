package com.example.teamrainbowofficials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fifth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener{
            val intent = Intent(this, Third::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button3)
        button2.setOnClickListener{
            val intent = Intent(this, Third::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.button4)
        button3.setOnClickListener{
            val intent = Intent(this, seven::class.java)
            startActivity(intent)
        }
    }
}