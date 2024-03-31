package com.example.app3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.app3.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2
        binding.diceStartBtn.setOnClickListener {
            Toast.makeText(this, "주사위 GO!",Toast.LENGTH_LONG).show()

            Log.d("MainActivity", Random.nextInt(1,6).toString())
            Log.d("MainActivity", Random.nextInt(1,6).toString())

            val ran1 = Random.nextInt(1,7)
            val ran2 = Random.nextInt(1,7)

            if(ran1 == 1){
                diceImage1.setImageResource(R.drawable.dice_1)
            }
            else if (ran1 == 2){
                diceImage1.setImageResource(R.drawable.dice_2)
            }
            else if (ran1 == 3){
                diceImage1.setImageResource(R.drawable.dice_3)
            }
            else if (ran1 == 4){
                diceImage1.setImageResource(R.drawable.dice_4)
            }
            else if (ran1 == 5){
                diceImage1.setImageResource(R.drawable.dice_5)
            }
            else{
                diceImage1.setImageResource(R.drawable.dice_6)
            }

            if(ran2 == 1){
                diceImage2.setImageResource(R.drawable.dice_1)
            }
            else if (ran2 == 2){
                diceImage2.setImageResource(R.drawable.dice_2)
            }
            else if (ran2 == 3){
                diceImage2.setImageResource(R.drawable.dice_3)
            }
            else if (ran2 == 4){
                diceImage2.setImageResource(R.drawable.dice_4)
            }
            else if (ran2 == 5){
                diceImage2.setImageResource(R.drawable.dice_5)
            }
            else{
                diceImage2.setImageResource(R.drawable.dice_6)
            }
        }
    }
}