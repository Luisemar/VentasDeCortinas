package com.ventadecortinas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ToDoConsultaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ToDoConsultaFragment : Fragment() {
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
        val fragmento: View = inflater.inflate(R.layout.fragment_to_do_consulta, container, false)
        return fragmento
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerTodoList: RecyclerView = view.findViewById(R.id.reciclerTodoList)
        var datos: ArrayList<Task> = ArrayList()
        datos.add(Task(0, "Vendedor Pedro","1","1","Cliente Carolina",
            "1","1","1","1","1","1","1","1"))
        datos.add(Task(1, "Vendedor Juan","2","1","Cliente Mileidy",
            "1","1","1","1","1","1","1","1"))
        datos.add(Task(3, "Vendedor Leon","3","1","Cliente Luis",
            "1","1","1","1","1","1","1","1"))
        var taskAdapter = TaskAdapter(datos){
            val  datos = Bundle()
             datos.putString("vendedor", it.seller)
            datos.putString("cvendedor", it.cseller)
            datos.putString("fecha", it.date)
            datos.putString("cliente", it.customer)
            datos.putString("ccliente", it.ccustomer)
            datos.putString("direcion",it.direccion)
            datos.putString("latitud", it.latutud)
            datos.putString("longitud", it.longitud)
            datos.putString("codcortinas", it.codcortina)
            datos.putString("altocortina", it.altocortina)
            datos.putString("largocortina", it.largocortina)
            datos.putString("valorventa", it.valorventa)

            Navigation.findNavController(view).navigate(R.id.nav_detailConsultas,datos)
        }
        recyclerTodoList.setHasFixedSize(true)
        recyclerTodoList.adapter = taskAdapter
        recyclerTodoList.addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.VERTICAL))
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ToDoConsultaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ToDoConsultaFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}