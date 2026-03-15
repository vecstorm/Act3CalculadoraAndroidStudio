package com.example.act3androidstudio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity2_2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2_2)

        val backButton = findViewById<Button>(R.id.backButtonAct2_2)

        backButton.setOnClickListener{
            val changeActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(changeActivityIntent)
        }

        val nextButton = findViewById<Button>(R.id.nextButtonAct2_2)

        nextButton.setOnClickListener{
            val changeActivityIntent = Intent(this, Activity2_3::class.java)
            startActivity(changeActivityIntent)
        }

    }
}