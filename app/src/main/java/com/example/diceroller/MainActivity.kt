package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImageView: ImageView   // Declaring nullable & lateinit promises that it will be initialized before calling any operations on it

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImageView = findViewById(R.id.dice_image)
        val rollButton : Button = findViewById(R.id.button_roll)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt : Int = Random.nextInt(6) + 1

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImageView.setImageResource(drawableResource)
    }
}
