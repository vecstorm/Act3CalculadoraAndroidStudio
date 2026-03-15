package com.example.act3androidstudio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity2_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2_3)

        val backButton = findViewById<Button>(R.id.backButtonAct2_3)

        backButton.setOnClickListener{
            val changeActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(changeActivityIntent)
        }
    }
}