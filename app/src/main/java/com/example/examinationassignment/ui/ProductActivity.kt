package com.example.examinationassignment.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.examinationassignment.R
import com.example.examinationassignment.data.ItemData
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val item = intent.getParcelableExtra<ItemData>("data")
        tvProductName.text = item?.name
        tvDescription.text = item?.description
        tvPrice.text = item?.price?.toShort().toString()

        btnBuy.setOnClickListener {
            AlertDialog(this).show()

        }
    }




}