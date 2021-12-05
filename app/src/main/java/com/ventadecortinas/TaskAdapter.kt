package com.ventadecortinas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class TaskAdapter(private val datos: ArrayList<Task>, private val clickListener: (Task) -> Unit):
    RecyclerView.Adapter<TaskAdapter.TaskViewHolder>(){

    class TaskViewHolder(val layout: View) : RecyclerView.ViewHolder(layout) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val Layout = LayoutInflater.from(parent.context)
            .inflate(R.layout.task_list_items, parent, false) as LinearLayout
        return TaskViewHolder(Layout)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = datos[position]
        val textViewDate: TextView = holder.layout.findViewById(R.id.textViewDate)
        val textViewseller: TextView = holder.layout.findViewById(R.id.textViewseller)
//        val textViewcustomer: TextView = holder.layout.findViewById(R.id.textViewcustomer)
        textViewDate.text = task.date
        textViewseller.text = task.seller
//        textViewcustomer.text = task.customer
        holder.layout.setOnClickListener{clickListener(task)}
    }

    override fun getItemCount(): Int {
        return datos.size
    }
}