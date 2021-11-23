package com.ventadecortinas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.main_toolbar))
    }

    fun onRegVendedor(botonRegVend: android.view.View) {
        val intento = Intent(this, RegistroVendedoresActivity::class.java)
        startActivity(intento)
    }

    fun onIngVendedor(view: android.view.View) {
                val intento = Intent(this, IniciarSesionActivity::class.java)
                startActivity(intento)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main_activity,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId){
        R.id.action_search ->{
           Toast.makeText(this,R.string.txt_action_search,Toast.LENGTH_LONG).show()
             true
        }
        R.id.action_setting ->{
            Toast.makeText(this,R.string.txt_action_settings,Toast.LENGTH_LONG).show()
            true
        }
        R.id.action_Logout ->{
            Toast.makeText(this,R.string.txt_action_logout,Toast.LENGTH_LONG).show()
            true
        }
        else ->{
            super.onOptionsItemSelected(item)
        }
    }
}