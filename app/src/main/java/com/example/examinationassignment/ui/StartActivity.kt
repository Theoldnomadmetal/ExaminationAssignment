package com.example.examinationassignment.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.examinationassignment.R
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    private val listOfLogins = arrayListOf("asd","asde")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        setupListeners()
        listOfLogins.listIterator(0).toString()
    }

    private fun setupListeners() {
        btn_login.setOnClickListener {
            startActivity(Intent(this,ItemActivity::class.java))

        }
    }


}