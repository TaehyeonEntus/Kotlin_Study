package com.example.val_log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value1 = "여기는 var입니다"
        val value2 = "여기는 val입니다"

        value1 = "var 수정 가능"
        //value2 = "val 수정 불가"

        val test = "Test Message"

        Log.e("MainActivity",test)  //오류
        Log.w("MainActivity",test)  //경고
        Log.i("MainActivity",test)  //정보
        Log.d("MainActivity",test)  //디버그
        Log.v("MainActivity",test)  //상세
    }
}