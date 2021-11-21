package com.ventadecortinas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

public class ConsultaVentasActivity : AppCompatActivity() {

    private ListView listView;

    private Arraylist <String> ConsultaVentas;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consulta_ventas);
        listView = findViewById(R.id.ListViewVentas); //Conexion vista con el código java//

        ConsultaVentas = new ArrayList<>(); //Inicio Array list//
        //Agrego Ventas//
        ConsultaVentas.add("Venta 1");
        ConsultaVentas.add("Venta 2");
        ConsultaVentas.add("Venta 3");
        ConsultaVentas.add("Venta 4");
        ConsultaVentas.add("Venta 5");

        ArrayAdapter<String> adapter = new Adapter<String>(context this, android.R.layout.simple_list_item_1, ConsultaVentas);
    }
}