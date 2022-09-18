package com.example.oldsupportandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.hellolibrary.HelloMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.text)

        val text = HelloMessage().getMessage()
        textView.text = text
    }
}