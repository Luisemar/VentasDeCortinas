package com.ventadecortinas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.room.*
import com.ventadecortinas.room_database.ToDo
import com.ventadecortinas.room_database.ToDoDatabase
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NewTaskFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NewTaskFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_task, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val spiTask: Spinner = view.findViewById(R.id.spiTask)
        val edtccVendedor: EditText = view.findViewById(R.id.edtccVendedor)
        val edtFecgaVenta: EditText = view.findViewById(R.id.edtFechaVta)
        val edtNomCliente: EditText = view.findViewById(R.id.edtNomCliente)
        val edtccCliente: EditText = view.findViewById(R.id.edtccCliente)
        val edtDirCliente: EditText = view.findViewById(R.id.edtDirCliente)
        val edtLatidud: EditText = view.findViewById(R.id.edtLatidud)
        val edtLongitud: EditText = view.findViewById(R.id.edtLongitud)
        val edtCodigoCortina: EditText = view.findViewById(R.id.edtCodigoCortina)
        val edtAltoCotina: EditText = view.findViewById(R.id.edtAltoCotina)
        val edtLargoCortina: EditText = view.findViewById(R.id.edtLargoCortina)
        val edtValorVenta: EditText = view.findViewById(R.id.edtValorVenta)

        val btnNewTask: Button = view.findViewById(R.id.btnNewTask)
//        var tareas = arrayOf("estudiar","Mercar","Hacer Ejercicio")
        var tareas: ArrayList<Task> = ArrayList()
        tareas.add(Task(0, "Fecha1","NombreCliente1","Carolina ","1",
            "1","1","1","1","1","1","1","1"))
        tareas.add(Task(1, "Fecha2","NombreCliente2","Mileidy ","1",
            "1","1","1","1","1","1","1","1"))
        tareas.add(Task(2, "Fecha3","NombreCliente3","Luis ","1",
            "1","1","1","1","1","1","1","1"))
        val taskAdapter = ArrayAdapter(context?.applicationContext!!,android.R.layout.simple_spinner_item, tareas)
        taskAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spiTask.adapter = taskAdapter
        btnNewTask.setOnClickListener {
          var vendedorSelecionado: Task = spiTask.selectedItem as Task
//            Toast.makeText(context?.applicationContext, spiTask.selectedItem.toString(), Toast.LENGTH_LONG).show()
        val room: ToDoDatabase =  Room.databaseBuilder(context?.applicationContext!!,ToDoDatabase::class.java,"ToDoDataBase").build()
        var todoDao = room.todoDao()
        val  task = ToDo(0,edtFecgaVenta.text.toString(),edtccVendedor.text.toString(),vendedorSelecionado.seller,
            edtccCliente.text.toString(), edtNomCliente.text.toString(),edtDirCliente.text.toString(),edtLatidud.text.toString(),
            edtLongitud.text.toString(),edtCodigoCortina.text.toString(),edtAltoCotina.text.toString(),
            edtLargoCortina.text.toString(),edtValorVenta.text.toString())
        runBlocking {
            launch {
                val result = todoDao.insertTask(task)
            }
        }


 //           Toast.makeText(context?.applicationContext, vendedorSelecionado.customer, Toast.LENGTH_LONG).show()

        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment NewTaskFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NewTaskFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}