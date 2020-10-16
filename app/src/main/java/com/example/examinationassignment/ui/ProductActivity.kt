package com.example.examinationassignment.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.examinationassignment.R
import com.example.examinationassignment.data.ItemData
import com.example.examinationassignment.ui.dialog.AlertDialogClass
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val item = intent.getParcelableExtra<ItemData>("data")
        val name = item?.name
        tvProductName.text = item?.name
        tvDescription.text = item?.description
        tvPrice.text = item?.price?.toString()
        setupListeners()


    }
    private fun setupListeners(){
        btnBuy.setOnClickListener {
            AlertDialogClass(this).show() //Не смог вывести текст товара в диалоговом окне

        }
        btn_goBack.setOnClickListener {
            startActivity(Intent(this,ItemActivity::class.java))
            finish()
        }
    }


}