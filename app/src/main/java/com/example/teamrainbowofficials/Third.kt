package com.example.teamrainbowofficials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Third : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val text = findViewById<Button>(R.id.button6)
        text.setOnClickListener{
            val intent = Intent(this, second::class.java)
            startActivity(intent)
        }
        val button = findViewById<Button>(R.id.button7)
        button.setOnClickListener{
            val intent = Intent(this, fourth::class.java)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button11)
        button2.setOnClickListener{
            val intent = Intent(this, fifth::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.button8)
        button3.setOnClickListener{
            val intent = Intent(this, sixth::class.java)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener{
            val intent = Intent(this, seven::class.java)
            startActivity(intent)
        }
    }
    }
