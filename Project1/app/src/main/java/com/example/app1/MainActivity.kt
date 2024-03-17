package com.example.app1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //화면 클릭 구현
        val image1 = findViewById<ImageView>(R.id.mapleImage1)
        image1.setOnClickListener{
            Toast.makeText(this,"1번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, MapleActivity1::class.java)
            startActivity(intent)
        }
    }
}