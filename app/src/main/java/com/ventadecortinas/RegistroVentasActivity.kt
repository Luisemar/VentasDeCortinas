package com.ventadecortinas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class RegistroVentasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_ventas)
        setSupportActionBar(findViewById(R.id.consulta_toolbar))
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_consulta,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId){
        R.id.action_searchv ->{
            val intento = Intent(this, DrawerActivity::class.java)
            startActivity(intento)
            true
        }
        else ->{
            super.onOptionsItemSelected(item)
        }
    }
}

