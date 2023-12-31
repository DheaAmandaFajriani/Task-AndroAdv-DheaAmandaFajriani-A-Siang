package com.example.butterfly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    private val screenDelay: Long = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            val i = Intent(this, pembukaan1::class.java) // Replace MainActivity with your desired activity
            startActivity(i)
            finish()
        }, screenDelay)

    }
}