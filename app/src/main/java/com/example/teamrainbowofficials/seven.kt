package com.example.teamrainbowofficials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class seven : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seven)

        val button = findViewById<Button>(R.id.button3)
        button.setOnClickListener{
            val intent = Intent(this, Third::class.java)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.button11)
        button4.setOnClickListener{
            val intent = Intent(this, fifth::class.java)
            startActivity(intent)
        }

        val image = findViewById<ImageView>(R.id.discort)
        image.setOnClickListener{
            val intent = Intent(this, nine::class.java)
            startActivity(intent)
        }
        val button0 = findViewById<Button>(R.id.button10)
        button0.setOnClickListener{
            val intent = Intent(this, Third::class.java)
            startActivity(intent)
        }
    }
}