package com.example.app6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.app6.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentenceList = mutableListOf<String>()
        sentenceList.add("검정화면에 대충 흰 글씨 쓰면 명언1")
        sentenceList.add("검정화면에 대충 흰 글씨 쓰면 명언2")
        sentenceList.add("검정화면에 대충 흰 글씨 쓰면 명언3")
        sentenceList.add("검정화면에 대충 흰 글씨 쓰면 명언4")
        sentenceList.add("검정화면에 대충 흰 글씨 쓰면 명언5")
        sentenceList.add("검정화면에 대충 흰 글씨 쓰면 명언6")
        sentenceList.add("검정화면에 대충 흰 글씨 쓰면 명언7")
        sentenceList.add("검정화면에 대충 흰 글씨 쓰면 명언8")
        sentenceList.add("검정화면에 대충 흰 글씨 쓰면 명언9")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.showAllSentenceBtn.setOnClickListener {
            val intent = Intent(this, SentenceActivity::class.java)
            startActivity(intent)
        }
        binding.goodWordTextArea.setText(sentenceList.random())
    }
}