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

        // 화면 클릭 구현
        val image1 = findViewById<ImageView>(R.id.mapleImage1)
        image1.setOnClickListener{
            Toast.makeText(this,"1번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, MapleActivity1::class.java)
            startActivity(intent)
        }
        val image2 = findViewById<ImageView>(R.id.mapleImage2)
        image2.setOnClickListener{
            Toast.makeText(this,"2번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, MapleActivity2::class.java)
            startActivity(intent)
        }
        val image3 = findViewById<ImageView>(R.id.mapleImage3)
        image3.setOnClickListener{
            Toast.makeText(this,"3번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, MapleActivity3::class.java)
            startActivity(intent)
        }
        val image4 = findViewById<ImageView>(R.id.mapleImage4)
        image4.setOnClickListener{
            Toast.makeText(this,"4번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, MapleActivity4::class.java)
            startActivity(intent)
        }
        val image5 = findViewById<ImageView>(R.id.mapleImage5)
        image5.setOnClickListener{
            Toast.makeText(this,"5번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, MapleActivity5::class.java)
            startActivity(intent)
        }
        val image6 = findViewById<ImageView>(R.id.mapleImage6)
        image6.setOnClickListener{
            Toast.makeText(this,"6번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, MapleActivity6::class.java)
            startActivity(intent)
        }
        val image7 = findViewById<ImageView>(R.id.mapleImage7)
        image7.setOnClickListener{
            Toast.makeText(this,"7번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, MapleActivity7::class.java)
            startActivity(intent)
        }
        val image8 = findViewById<ImageView>(R.id.monkeyImage1)
        image8.setOnClickListener{
            Toast.makeText(this,"8번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, MonkeyActivity1::class.java)
            startActivity(intent)
        }
        val image9 = findViewById<ImageView>(R.id.monkeyImage2)
        image9.setOnClickListener{
            Toast.makeText(this,"9번 클릭 완료",Toast.LENGTH_LONG).show()

            val intent = Intent(this, MonkeyActivity2::class.java)
            startActivity(intent)
        }
    }
}