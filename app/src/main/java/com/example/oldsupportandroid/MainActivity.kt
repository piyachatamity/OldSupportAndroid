package com.example.oldsupportandroid

import android.content.Intent
//import android.support.v7.app.AppCompatActivityvity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.common.LibraryCommonModel
//import com.amityeko.rnr.common.base.BaseActivity
import com.example.hellolibrary.HelloMessage
import com.example.hellolibrary.new_ui.PageEmptyActivity

//import com.example.hellolibrary.new_ui.Page2Activity

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

        LibraryCommonModel().getMessage()
    }

    private fun openPageHello() {
        val intent = Intent(this, PageEmptyActivity::class.java)
        startActivity(intent)
    }
}