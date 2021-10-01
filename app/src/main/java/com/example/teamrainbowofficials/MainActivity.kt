package com.example.teamrainbowofficials

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val button = findViewById<Button>(R.id.button)
            button.setOnClickListener {
                val intent = Intent(this, Third::class.java)
                startActivity(intent)
            }
        val root_layout=findViewById<View>(R.id.root_layout)
        val animDrawable = root_layout.background as AnimationDrawable
        animDrawable.setEnterFadeDuration(10)
        animDrawable.setExitFadeDuration(2000)
        animDrawable.start()

        }
    }