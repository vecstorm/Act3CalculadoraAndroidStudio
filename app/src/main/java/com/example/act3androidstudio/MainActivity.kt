package com.example.act3androidstudio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goToAct1 = findViewById<Button>(R.id.GoToAct1Button)
        val goToAct2 = findViewById<Button>(R.id.GoToAct2Button)
        val goToAct3 = findViewById<Button>(R.id.GoToAct3Button)
        val goToAct4 = findViewById<Button>(R.id.GoToAct4Button)

        goToAct1.setOnClickListener{
            val changeActivityIntent = Intent(this, Activity1::class.java)
            startActivity(changeActivityIntent)
        }

        goToAct2.setOnClickListener{
            val changeActivityIntent = Intent(this, Activity2::class.java)
            startActivity(changeActivityIntent)
        }

        goToAct3.setOnClickListener{
            val changeActivityIntent = Intent(this, Activity3::class.java)
            startActivity(changeActivityIntent)
        }

        goToAct4.setOnClickListener{
            val changeActivityIntent = Intent(this, Activity4::class.java)
            startActivity(changeActivityIntent)
        }

    }
}