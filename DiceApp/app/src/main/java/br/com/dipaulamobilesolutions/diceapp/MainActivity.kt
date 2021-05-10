package br.com.dipaulamobilesolutions.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.btnRoll)

       rollButton.setOnClickListener{
           rollDice()
       }

        rollDice()

    }

    private fun rollDice() {
        val myDice = Dice(6)
        val resultImage: ImageView = findViewById(R.id.ivDice)


        val result = myDice.roll()

        val drawableResource = when(result){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultImage.setImageResource(drawableResource)
        resultImage.contentDescription = result.toString()

    }

    class Dice(val numSides: Int) {


        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}