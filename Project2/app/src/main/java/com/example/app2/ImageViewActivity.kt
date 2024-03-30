package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity

class ImageViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)

        val getData = intent.getStringExtra("data")
        //Toast.makeText(this, getData, Toast.LENGTH_LONG).show()

        val memberImage = findViewById<ImageView>(R.id.memberImageArea)

        if(getData == "1") {
            memberImage.setImageResource(R.drawable.maple2)
        }

        if(getData == "2") {
            memberImage.setImageResource(R.drawable.maple3)
        }

        if(getData == "3") {
            memberImage.setImageResource(R.drawable.maple4)
        }

        if(getData == "4") {
            memberImage.setImageResource(R.drawable.maple5)
        }

        if(getData == "5") {
            memberImage.setImageResource(R.drawable.maple6)
        }

        if(getData == "6") {
            memberImage.setImageResource(R.drawable.maple7)
        }

        if(getData == "7") {
            memberImage.setImageResource(R.drawable.maple1)
        }

        if(getData == "8") {
            memberImage.setImageResource(R.drawable.monkey1)
        }

        if(getData == "9") {
            memberImage.setImageResource(R.drawable.monkey2)
        }

    }
}