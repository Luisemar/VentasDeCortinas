package com.ventadecortinas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast

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
        var username: String = edtUsername!!.text.toString()
        var password: String = edtPassword!!.text.toString()
        if (username == "e6@email.com" && password == "1") {
//            val intento = Intent(this, OpcionesVendedorActivity::class.java)
            val intento = Intent(this, TodoFragmentOpVendActivity::class.java)
            startActivity(intento)
            Toast.makeText(applicationContext,"WELCOME",Toast.LENGTH_LONG).show()
            }
        else{
            Toast.makeText(this,"Invalid username or password",Toast.LENGTH_LONG).show()
        }
    }
}