package com.example.examinationassignment.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.examinationassignment.R
import com.example.examinationassignment.data.ItemData
import com.example.examinationassignment.data.ResponseBase
import com.example.examinationassignment.data.RetrofitBuilder
import com.example.examinationassignment.ui.recycler.ItemListener
import com.example.examinationassignment.ui.recycler.RvAdapter
import kotlinx.android.synthetic.main.activity_item.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ItemActivity : AppCompatActivity(),ItemListener {

    private val adapter = RvAdapter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)
        getProducts()
        recycler.adapter = adapter
    }

    private fun getProducts() {
    RetrofitBuilder.getService()?.getProductList(1)?.enqueue(object : Callback<ResponseBase>{
        override fun onFailure(call: Call<ResponseBase>, t: Throwable) {
            Log.d("asd","Fail")
        }

        override fun onResponse(call: Call<ResponseBase>, response: Response<ResponseBase>) {
            Log.d("asd","OK")
            if (response.isSuccessful && response.body() != null)
                adapter.update(response.body()?.data)
        }
    })
    }

    override fun itemsClick(item: ItemData) {
        val intent = Intent(this,ProductActivity::class.java)
        intent.putExtra("data", item)
        startActivity(intent)
    }
}