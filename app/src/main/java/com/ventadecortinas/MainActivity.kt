package com.ventadecortinas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onRegVendedor(botonRegVend: android.view.View) {
        val intento = Intent(this, RegistroVendedoresActivity::class.java)
        startActivity(intento)
    }

    fun onIngVendedor(view: android.view.View) {
        val intento = Intent(this, OpcionesVendedorActivity::class.java)
        startActivity(intento)
    }
}