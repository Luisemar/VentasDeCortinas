package com.ventadecortinas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class IniciarSesionActivity : AppCompatActivity() {

    private var edtUsername: EditText? = null
    private var edtPassword: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar_sesion)

        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)
    }

    fun onIniSesion(view: android.view.View) {
        if (edtUsername!!.text.toString() == "e6@email.com") {
            if (edtPassword!!.text.toString() == "1") {
                val intento = Intent(this, OpcionesVendedorActivity::class.java)
                startActivity(intento)
            }
        }
    }
}