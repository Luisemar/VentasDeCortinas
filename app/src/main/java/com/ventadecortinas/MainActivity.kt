package com.ventadecortinas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
    }

    public void irLista (View view){
        Intent i= new Intent(packageContext this, ConsultaVentasActivity.class);
        startActivity(i);
    }
}