package com.example.app6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class SentenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sentence)

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

        val sentenceAdapter = ListViewAdapter(sentenceList)

        val listview = findViewById<ListView>(R.id.sentenceListView)

        listview.adapter = sentenceAdapter
    }
}