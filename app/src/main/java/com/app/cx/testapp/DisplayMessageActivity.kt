package com.app.cx.testapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val message=intent.getStringExtra(ITEM_CLASS)
        Log.e("进入下个页面",message)
        val textView=findViewById<TextView>(R.id.textView2).apply { text=message }
    }
}
