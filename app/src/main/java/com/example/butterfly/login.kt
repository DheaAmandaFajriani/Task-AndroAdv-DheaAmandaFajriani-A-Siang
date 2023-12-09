package com.example.butterfly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class login : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnmasuk :Button
    private lateinit var lupapw :TextView
    private lateinit var btndaftar :TextView
    private lateinit var edt_username :EditText
    private lateinit var edt_email :EditText
    private lateinit var edt_pw :EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edt_username = findViewById(R.id.editText_username)
        edt_email = findViewById(R.id.editText_email)
        edt_pw = findViewById(R.id.editText_pw)


        btndaftar = findViewById(R.id.daftar)
        btnmasuk = findViewById(R.id.btnlogin)
        lupapw = findViewById(R.id.lupa_sandi)
        btndaftar.setOnClickListener(this)
        btnmasuk.setOnClickListener(this)
        lupapw.setOnClickListener(this)

        val bundle = intent.extras
        if(bundle !=null){
            edt_username.setText(bundle.getString("username"))
            edt_email.setText(bundle.getString("email"))
            edt_pw.setText(bundle.getString("password"))
        }
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnlogin->{
                val bundle = Bundle()
                bundle.putString("email",edt_username.text.toString())
                val intent = Intent(this,home::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
            R.id.daftar->{
                val intent =Intent(this, Daftar::class.java)
                startActivity(intent)
            }

            R.id.lupa_sandi->{
                val intent = Intent(this, lupaSaandi::class.java)
                startActivity(intent)
            }
        }
    }
}