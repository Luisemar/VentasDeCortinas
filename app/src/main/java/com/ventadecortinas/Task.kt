package com.ventadecortinas

data class Task(val id: Int,val seller: String,val cseller: String,val date: String, val customer: String,
                val ccustomer: String,val direccion: String,val latutud: String,val longitud: String,
                val codcortina: String,val altocortina: String,val largocortina: String,val valorventa: String){
    override fun toString(): String {
        return seller
    }
}
