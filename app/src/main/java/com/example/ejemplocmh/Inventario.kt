package com.example.ejemplocmh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Inventario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventario)
        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .setReorderingAllowed(true)
                .add(R.id.fragment_container_view,ToDoFragment::class.java, null,"todo")
                .commit()
        }
    }
}

