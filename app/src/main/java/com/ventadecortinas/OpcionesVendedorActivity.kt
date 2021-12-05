package com.ventadecortinas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class OpcionesVendedorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones_vendedor)
    }
    fun onRegArtAbo(view: android.view.View) {
      val intento = Intent(this, DrawerActivity::class.java)
      startActivity(intento)
    }
    fun onRegVen(view: android.view.View) {
 //     val intento = Intent(this, RegistroVentasActivity::class.java)
      val intento = Intent(this, ConsultaVentasActivity::class.java)
      startActivity(intento)
    }
}