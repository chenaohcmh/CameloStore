package com.example.ejemplocmh


import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
public class ToDoFragment:Fragment() {
    override fun onCreate(savedInstanceState: Bundle?)
    {super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View?{
        /* crear objeto con val=var inmutables */
        val fragmento = inflater.inflate(R.layout.fragment_to_do, container, false)
        val detalle1: Button =fragmento.findViewById(R.id.btn_pruct1)
        val detalle2: Button =fragmento.findViewById(R.id.btn_pruct2)
        val detalle3: Button =fragmento.findViewById(R.id.btn_pruct3)
        val detalle4: Button =fragmento.findViewById(R.id.btn_pruct4)

        detalle1.setOnClickListener(View.OnClickListener {
            val datos1=Bundle()
            datos1.putString("nombre","Avocato")
            datos1.putString("descripcion","Pin metalico")
            datos1.putString("cantidad","1")
            datos1.putString("precio","12.000")
            activity?.supportFragmentManager?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, detailsFragment::class.java, datos1,"detalle")
                ?.addToBackStack("")
                ?.commit()})
        detalle2.setOnClickListener(View.OnClickListener {
            val datos2=Bundle()
            datos2.putString("nombre","stich")
            datos2.putString("descripcion","Pin metalico")
            datos2.putString("cantidad","1")
            datos2.putString("precio","12.000")
            activity?.supportFragmentManager
                ?.beginTransaction()?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, detailsFragment::class.java, datos2,"detalle")
                ?.addToBackStack("")
                ?.commit()})
        detalle3.setOnClickListener(View.OnClickListener {
            val datos3=Bundle()
            datos3.putString("nombre1","Gorillaz")
            datos3.putString("descripcion","Pin metalico")
            datos3.putString("cantidad","1")
            datos3.putString("precio","12.000")
            activity?.supportFragmentManager?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, detailsFragment::class.java, datos3,"detalle")
                ?.addToBackStack("")
                ?.commit()})
        detalle4.setOnClickListener(View.OnClickListener {
            val datos4=Bundle()
            datos4.putString("nombre","Wachman")
            datos4.putString("descripcion","Pin metalico")
            datos4.putString("cantidad","1")
            datos4.putString("precio","12.000")
            activity?.supportFragmentManager?.beginTransaction()
                ?.setReorderingAllowed(true)
                ?.replace(R.id.fragment_container_view, detailsFragment::class.java, datos4,"detalle")
                ?.addToBackStack("")
                ?.commit()})
        return fragmento}}