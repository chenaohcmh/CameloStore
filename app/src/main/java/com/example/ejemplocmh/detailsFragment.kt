package com.example.ejemplocmh

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class detailsFragment: Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val fragmento = inflater.inflate(R.layout.activityfragmentdetails, container, false)
        var nombre = requireArguments().getString("nombre")
        /* presentarla al textview*/
        var textviewnombre:TextView=fragmento.findViewById(R.id.editTextNombre)
        textviewnombre.text=nombre
        /* segundo textview */
        var descripcion = requireArguments().getString("descripcion")
        /* presentarla al textview*/
        var textviewdescripcion:TextView=fragmento.findViewById(R.id.editTextDescripcion)
        textviewdescripcion.text=descripcion
        /* tercer textview */
        var cantidad= requireArguments().getString("cantidad")
        /* presentarla al textview*/
        var textviewcantidad:TextView=fragmento.findViewById(R.id.editTextCantidad)
        textviewcantidad.text=cantidad
        var precio= requireArguments().getString("precio")
        /* presentarla al textview*/
        var textviewprecio:TextView=fragmento.findViewById(R.id.editTextPrecio)
        textviewprecio.text=precio



        return fragmento
    }
}