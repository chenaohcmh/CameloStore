package com.example.ejemplocmh

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {

    private var edtUsername: EditText? = null
    private var edtPassword: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(findViewById(R.id.My_toolbar))

        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)

    }

    fun onlogin(botonLogin: View) {

        Toast.makeText(this, "entro a la función loging", Toast.LENGTH_LONG).show()


        //val positiveButton = { dialog: DialogInterface, entero: Int ->
        val intento = Intent(this, WelcomeActivity::class.java)
        startActivity(intento)
        //}

        Toast.makeText(this, "se lanza actividad catalogo", Toast.LENGTH_LONG).show()

        //val negativeButtom = { xx: DialogInterface, yy: Int ->
        //     Toast.makeText(this, "cancela Cliente", Toast.LENGTH_LONG).show()
        //}

    }

    fun onlogin2(botonLogin: View) {

        Toast.makeText(this, "entro a la función login Admon", Toast.LENGTH_LONG).show()

        //val positiveButton = { dialog: DialogInterface, entero: Int ->
        val intento1 = Intent(this, Inventario::class.java)
        startActivity(intento1)
        //}
        Toast.makeText(this, "se lanza actividad Admin", Toast.LENGTH_LONG).show()


        // val negativeButtom = { xx: DialogInterface, yy: Int ->
        //       Toast.makeText(this, "cancela admon", Toast.LENGTH_LONG).show()
        // }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.itm_buscar -> {
            Toast.makeText(this, "entro a la función login Admon", Toast.LENGTH_LONG).show()
            true
        }
        R.id.itm_Version -> {
            val intento1 = Intent(this, AdmonActivity::class.java)
            startActivity(intento1)
            true
        }

        else -> {
            super.onOptionsItemSelected(item)

        }


    }
}


/*if (edtUsername!!.text.toString() == "1") {

    val dialogo = AlertDialog.Builder(this).setTitle("Bienvenido" + edtUsername)
        //.setMessage(R.string.txt_welcomeuser)
        .setPositiveButton("ok", positiveButton)
        .create().show()
    //.setNegativeButton("cancel",negativeButtom)


    if (edtPassword!!.text.toString() != null) {
        val intento = Intent(this, WelcomeActivity::class.java)
        startActivity(intento)
    } else {
        val dialogalert = AlertDialog.Builder(this).setTitle("Error en password")
            .create().show()
        Toast.makeText(this, "contraseña o usuario incorrecto", Toast.LENGTH_LONG)
            .show()
    }
}
if (edtUsername!!.text.toString() == "2") {
    val dialogo = AlertDialog.Builder(this).setTitle("Bienvenido" + edtUsername)
        //.setMessage(R.string.txt_welcomeuser)
        .setPositiveButton("ok", positiveButton)
        //.setNegativeButton("cancel",negativeButtom)
        .create().show()


    if (edtPassword!!.text.toString() != null) {
        val intento = Intent(this, AdmonActivity::class.java)
        startActivity(intento)
    } else {
        val dialogalert = AlertDialog.Builder(this).setTitle("Error en password")
            .create().show()
        Toast.makeText(this, "contraseña o usuario incorrecto", Toast.LENGTH_LONG)
            .show()
    }
}
}*/