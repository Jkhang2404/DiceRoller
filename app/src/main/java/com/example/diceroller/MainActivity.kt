package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice1 = Dice(6)
        val diceRoll1 = dice1.roll()
        //val resultTextView1: TextView = findViewById(R.id.textView1)
        //resultTextView1.text = diceRoll1.toString()
        val resultImageView1: ImageView = findViewById(R.id.imageView1)
        resultImageView1.setImageResource(R.drawable.dice1)

        if(diceRoll1 == 1){ resultImageView1.setImageResource(R.drawable.dice1) }
        if(diceRoll1 == 2){ resultImageView1.setImageResource(R.drawable.dice2) }
        if(diceRoll1 == 3){ resultImageView1.setImageResource(R.drawable.dice3) }
        if(diceRoll1 == 4){ resultImageView1.setImageResource(R.drawable.dice4) }
        if(diceRoll1 == 5){ resultImageView1.setImageResource(R.drawable.dice5) }
        if(diceRoll1 == 6){ resultImageView1.setImageResource(R.drawable.dice6) }


        val dice2 = Dice(6)
        val diceRoll2 = dice2.roll()
        //val resultTextView2: TextView = findViewById(R.id.textView2)
        //resultTextView2.text = diceRoll2.toString()
        val resultImageView2: ImageView = findViewById(R.id.imageView2)
        resultImageView2.setImageResource(R.drawable.dice1)

        if(diceRoll2 == 1){ resultImageView2.setImageResource(R.drawable.dice1) }
        if(diceRoll2 == 2){ resultImageView2.setImageResource(R.drawable.dice2) }
        if(diceRoll2 == 3){ resultImageView2.setImageResource(R.drawable.dice3) }
        if(diceRoll2 == 4){ resultImageView2.setImageResource(R.drawable.dice4) }
        if(diceRoll2 == 5){ resultImageView2.setImageResource(R.drawable.dice5) }
        if(diceRoll2 == 6){ resultImageView2.setImageResource(R.drawable.dice6) }

    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}