package com.example.act3androidstudio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.HorizontalScrollView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class Activity1  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val backButton = findViewById<Button>(R.id.backButtonAct1)
        val toggle = findViewById<ToggleButton>(R.id.toggleButton)

        toggle.setOnClickListener{
            val scrollbar = findViewById<HorizontalScrollView>(R.id.horizontalScrollView)
            scrollbar.isHorizontalScrollBarEnabled = !scrollbar.isHorizontalScrollBarEnabled

        }

        backButton.setOnClickListener{
            val changeActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(changeActivityIntent)
        }

    }
}
