package com.example.oldsupportandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.hellolibrary.HelloMessage
import com.example.hellolibrary.ui.PageHelloActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.text)
        val button: Button = findViewById(R.id.btn)

        val text = HelloMessage().getMessage()
        textView.text = text

        button.setOnClickListener {
            openPageHello()
        }
    }

    private fun openPageHello() {
        val intent = Intent(this, PageHelloActivity::class.java)
        startActivity(intent)
    }
}