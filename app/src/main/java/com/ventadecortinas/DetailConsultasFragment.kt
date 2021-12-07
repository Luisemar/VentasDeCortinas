package com.ventadecortinas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.room.Room
import com.ventadecortinas.room_database.ToDoDatabase
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailConsultasFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailConsultasFragment : Fragment() {
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
        val fragmento =  inflater.inflate(R.layout.fragment_detail_consultas, container, false)

/*      var fecha = requireArguments().getString("fecha")
        var vendedor = requireArguments().getString("vendedor")
        var cliente = requireArguments().getString("cliente")

        var txtViewFecha: TextView = fragmento.findViewById(R.id.txtView_A)
        var txtViewVendedor: TextView = fragmento.findViewById(R.id.txtView_B)
        var txtViewCliente: TextView = fragmento.findViewById(R.id.txtView_C)

        txtViewFecha.text = fecha
        txtViewVendedor.text = vendedor
        txtViewCliente.text = cliente*/

        return fragmento
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var txtViewNomVendedor: TextView = view.findViewById(R.id.txtViewNomVendedor)
        var txtViewccVendedor: TextView = view.findViewById(R.id.txtViewccVendedor)
        var txtViewFechaVta: TextView = view.findViewById(R.id.txtViewFechaVta)
        var txtViewNomCliente: TextView = view.findViewById(R.id.txtViewNomCliente)
        var txtViewccCliente: TextView = view.findViewById(R.id.txtViewccCliente)
        var txtViewDirCliente: TextView = view.findViewById(R.id.txtViewDirCliente)
        var txtViewLatidud: TextView = view.findViewById(R.id.txtViewLatidud)
        var txtViewLongitud: TextView = view.findViewById(R.id.txtViewLongitud)
        var txtViewCodigoCortina: TextView = view.findViewById(R.id.txtViewCodigoCortina)
        var txtViewAltoCotina: TextView = view.findViewById(R.id.txtViewAltoCotina)
        var txtViewLargoCortina: TextView = view.findViewById(R.id.txtViewLargoCortina)
        var txtViewValorVenta: TextView = view.findViewById(R.id.txtViewValorVenta)
        var id = requireArguments().getInt("id")
        val room: ToDoDatabase =  Room.databaseBuilder(context?.applicationContext!!,
            ToDoDatabase::class.java,"almacen").build()
        var todoDao = room.todoDao()
        runBlocking {
            launch {
                var result = todoDao.findById(id)
                txtViewNomVendedor.text = result.NomVendedor
                txtViewccVendedor.text = result.ccVendedor
                txtViewFechaVta.text = result.FechaVta
                txtViewNomCliente.text = result.NomCliente
                txtViewccCliente.text = result.ccCliente
                txtViewDirCliente.text = result.DirCliente
                txtViewLatidud.text = result.Latidud
                txtViewLongitud.text = result.Longitud
                txtViewCodigoCortina.text = result.CodigoCortina
                txtViewAltoCotina.text = result.AltoCotina
                txtViewLargoCortina.text = result.LargoCortina
                txtViewValorVenta.text = result.ValorVenta

            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DetailConsultasFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DetailConsultasFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}