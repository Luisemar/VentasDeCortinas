package com.ventadecortinas.room_database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
 data class ToDo (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val FechaVta: String,
    val ccVendedor: String,
    val NomVendedor: String,
    val ccCliente: String,
    val NomCliente: String,
    val DirCliente: String,
    val Latidud: String,
    val Longitud: String,
    val CodigoCortina: String,
    val AltoCotina: String,
    val LargoCortina: String,
    val ValorVenta: String
 )
