package com.example.butterfly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Daftar : AppCompatActivity(), View.OnClickListener {
    private lateinit var edt_username :EditText
    private lateinit var edt_email :EditText
    private lateinit var edt_pw :EditText
    private lateinit var btndaftar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)
        edt_username = findViewById(R.id.editText_username)
        edt_email = findViewById(R.id.editText_email)
        edt_pw = findViewById(R.id.editText_pw)

        btndaftar = findViewById(R.id.daftarbtn)
        btndaftar.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.daftarbtn->{
                val bundle = Bundle()
                bundle.putString("username",edt_username.text.toString())
                bundle.putString("email",edt_email.text.toString())
                bundle.putString("password",edt_pw.text.toString())
                val intent = Intent(this,login::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }

    }
}