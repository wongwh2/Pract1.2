package com.example.pract12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //In tutorial this is needed but don't know what the use is.
        //val rollButton: Button = findViewById(R.id.roll_button)
        roll_button.setOnClickListener { rollDice() }
        //val rollButton2: Button = findViewById(R.id.roll_button2)
        roll_button2.setOnClickListener { countUp() }
    }
    private fun rollDice(){
        Toast.makeText(this, "Dice Rolled",
            Toast.LENGTH_SHORT).show()
        val randomInt = Random().nextInt(6) + 1
        textView.text = randomInt.toString()
        val randomInt1 = Random().nextInt(6) + 1
        textView2.text = randomInt1.toString()
        val randomInt2 = Random().nextInt(6) + 1
        textView3.text = randomInt2.toString()
    }
    private fun countUp(){
        val yeet = Integer.parseInt(textView.text as String)
        if(yeet<6){
            val newYeet = yeet + 1
            textView.text = newYeet.toString()
        Toast.makeText(this, "Dice Up",
            Toast.LENGTH_SHORT).show()
            }
        val yeet1 = Integer.parseInt(textView2.text as String)
        if(yeet1<6){
            val newYeet = yeet1 + 1
            textView2.text = newYeet.toString()
            Toast.makeText(this, "Dice Up",
                Toast.LENGTH_SHORT).show()
        }
        val yeet2 = Integer.parseInt(textView3.text as String)
        if(yeet2<6){
            val newYeet = yeet2 + 1
            textView3.text = newYeet.toString()
            Toast.makeText(this, "Dice Up",
                Toast.LENGTH_SHORT).show()
        }
    }
}
