package com.example.hellolibrary.new_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.common.LibraryCommonModel
//import com.amityeko.rnr.common.base.BaseActivity
import com.example.hellolibrary.R

class PageEmptyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_empty)

        LibraryCommonModel().getMessage()
//        val ac = BaseActivity()
    }
}