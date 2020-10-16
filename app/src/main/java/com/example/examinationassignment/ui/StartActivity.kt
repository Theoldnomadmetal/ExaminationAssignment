package com.example.examinationassignment.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBar
import com.example.examinationassignment.R
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
//    Прошу прощения за такую реализацию формы логина, другого варианта не придумал.
//    Проект не самый лучший, уже засыпаю с непривычки, дальше не было сил делать
    val login1 = "tempuser@gmail.com"
    val pass1 = "123456Qwer"
    val login2 = "newmain@mail.ru"
    val pass2 = "qwerty"
    val login3 = "admin@admin.kg"
    val pass3 = "123456"
    val login4 = "gotoisbad@dd.bb"
    val pass4 = "todo123"
    val login5 = "asd"
    val pass5 = "asd"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        setupListeners()


    }

    private fun setupListeners() {
        btn_login.setOnClickListener {
            authorization()
        }
    }
    private fun authorization(){
        val login = et_login.text.toString()
        val password = et_password.text.toString()
        if(login == login1 && password == pass1){
            startActivity(Intent(this,ItemActivity::class.java))}
        if(login == login2 && password == pass2){
            startActivity(Intent(this,ItemActivity::class.java))}
        if(login == login3 && password == pass3){
            startActivity(Intent(this,ItemActivity::class.java))}
        if(login == login4 && password == pass4){
            startActivity(Intent(this,ItemActivity::class.java))}
        if(login == login5 && password == pass5){
            startActivity(Intent(this,ItemActivity::class.java))}
    }


}