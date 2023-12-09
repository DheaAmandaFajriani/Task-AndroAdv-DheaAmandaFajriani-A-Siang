package com.example.butterfly

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class pembukaan1 : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnlogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pembukaan1)

        btnlogin = findViewById(R.id.btnlogin)
        btnlogin.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnlogin ->{
                val intent = Intent(this, Daftar::class.java)
                startActivity(intent)
            }
        }
    }

}