package com.example.semana17kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIr = findViewById<Button>(R.id.btnIr)
        btnIr.setOnClickListener {
            val intent:Intent = Intent(this,Actividad2::class.java)
            startActivity(intent)
        }

    }

}