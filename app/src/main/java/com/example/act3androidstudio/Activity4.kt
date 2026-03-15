package com.example.act3androidstudio

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val display = findViewById<TextView>(R.id.DisplayText)

        val calculatorNumbers = listOf(
            findViewById<Button>(R.id.ZeroButton),
            findViewById<Button>(R.id.OneButton),
            findViewById<Button>(R.id.TwoButton),
            findViewById<Button>(R.id.ThreeButton),
            findViewById<Button>(R.id.FourButton),
            findViewById<Button>(R.id.FiveButton),
            findViewById<Button>(R.id.SixButton),
            findViewById<Button>(R.id.SevenButton),
            findViewById<Button>(R.id.EightButton),
            findViewById<Button>(R.id.NineButton)
        )

        val operators = listOf(
            findViewById<Button>(R.id.PlusButton),
            findViewById<Button>(R.id.RestarButton),
            findViewById<Button>(R.id.MultButton),
            findViewById<Button>(R.id.DivButton)
        )

        val equalButton = findViewById<Button>(R.id.buttonEqual)
        val deleteButton = findViewById<Button>(R.id.DeleteButton)
        val clearButton = findViewById<Button>(R.id.ClearButton)

        var firstNumber = ""
        var secondNumber = ""
        var currentOperator = ""
        var isSecondNumber = false

        calculatorNumbers.forEachIndexed { index, button ->
            button.setOnClickListener {
                val number = index.toString()

                if (!isSecondNumber) {
                    firstNumber += number
                    display.text = firstNumber
                } else {
                    secondNumber += number
                    display.text = secondNumber
                }
            }
        }


        operators.forEach { button ->
            button.setOnClickListener {
                currentOperator = button.text.toString()
                isSecondNumber = true
            }
        }

        equalButton.setOnClickListener {
            if (firstNumber.isNotEmpty() && secondNumber.isNotEmpty()) {
                val num1 = firstNumber.toDouble()
                val num2 = secondNumber.toDouble()

                val result = when (currentOperator) {
                    "+" -> num1 + num2
                    "-" -> num1 - num2
                    "*" -> num1 * num2
                    "/" -> num1 / num2
                    else -> 0.0
                }

                display.text = result.toString()

                firstNumber = result.toString()
                secondNumber = ""
                isSecondNumber = false
            }
        }


        deleteButton.setOnClickListener {
            if (!isSecondNumber) {
                if (firstNumber.isNotEmpty()) {
                    firstNumber = firstNumber.dropLast(1)
                    display.text = firstNumber
                }
            } else {
                if (secondNumber.isNotEmpty()) {
                    secondNumber = secondNumber.dropLast(1)
                    display.text = secondNumber
                }
            }
        }

        clearButton.setOnClickListener {
            firstNumber = ""
            secondNumber = ""
            currentOperator = ""
            isSecondNumber = false
            display.text = ""
        }
    }
}
