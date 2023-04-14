package com.example.randomgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
            val diceImage : ImageView = findViewById(R.id.imageView)
//            resultView.text = "6"
            val dice = Dice(6)
//            val result = "dice_" + "${dice.roll()}"
//
//            diceImage.setImageResource(R.drawable.)
            val drawableResource = when (dice.roll()){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage.setImageResource(drawableResource)
        }

    }
}

class Dice (val sides : Int){
    fun roll() : Int{
        return (1..sides).random()
    }
}