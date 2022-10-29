package com.example.ejemplocmh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        //setSupportActionBar(findViewById(R.id.My_toolbar))
        val fab:View=findViewById(R.id.fab46)
        fab.setOnClickListener{ View->
            Snackbar.make(View,"Práctica de action floating button",Snackbar.LENGTH_LONG).show()
            val llamado= Intent(this,MainActivity::class.java)
            startActivity(llamado)
        }


    }
}