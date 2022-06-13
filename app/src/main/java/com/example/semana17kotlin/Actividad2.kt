package com.example.semana17kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

data class Cadena(val nombre: String, val url: String)

class Actividad2 : AppCompatActivity() {
    val r1 = Cadena("Funciones", "Kotlin")
    val r2 = Cadena("Cambio", "Kotlin")
    var c = r1.copy()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)

        val btn = findViewById<Button>(R.id.btfun)
        btn.setOnClickListener{
            cambioText(c)
        }

    }

    fun cambioText(text:Cadena){
        c = text.copy()
        when(c.nombre){
            r1.nombre -> c = r2.copy()
            r2.nombre -> c = r1.copy()
            else -> print("Nunca pasara")
        }
        verEnPantalla("${c.nombre} con ${c.url}")
    }

    fun verEnPantalla( s : String){
        val txt = findViewById<TextView>(R.id.txfun1)
        txt.text = s
    }

}