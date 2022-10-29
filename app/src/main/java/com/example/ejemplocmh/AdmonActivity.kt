package com.example.ejemplocmh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class AdmonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admon)
        //setSupportActionBar(findViewById(R.id.My_toolbar))


        fun regresarInventario(botonLogin: View) {

            Toast.makeText(this, "entro a la función login Admon", Toast.LENGTH_LONG).show()

            //val positiveButton = { dialog: DialogInterface, entero: Int ->
            val inventario = Intent(this, Inventario::class.java)
            startActivity(inventario)
        }
    }
}




