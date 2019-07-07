package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button_roll)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val resultTextView : TextView = findViewById(R.id.text_view_number)

//            numberTextView.text = "Roll Clicked"
        val number : Int = Random.nextInt(6) + 1
        resultTextView.text = (number).toString()
        Toast.makeText(this, "Roll Clicked $number", Toast.LENGTH_SHORT).show()
    }
}
