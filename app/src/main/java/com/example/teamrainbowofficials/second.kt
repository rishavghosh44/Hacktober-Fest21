package com.example.teamrainbowofficials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val button = findViewById<Button>(R.id.button5)
        button.setOnClickListener{
            val intent = Intent(this, Third::class.java)
            startActivity(intent)
        }

        val image = findViewById<ImageView>(R.id.imageView6)
        image.setOnClickListener{
            val intent = Intent(this, cross::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.imageView5)
        image2.setOnClickListener{
            val intent = Intent(this, tick::class.java)
            startActivity(intent)
        }
    }
}