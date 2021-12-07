package com.ventadecortinas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ToDoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ToDoFragment : Fragment() {
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
        val fragmento: View = inflater.inflate(R.layout.fragment_to_do, container, false)
        val detail1: Button = fragmento.findViewById(R.id.btn_detail_1)
        val detail2: Button = fragmento.findViewById(R.id.btn_detail_2)


        detail1.setOnClickListener {
            val datos = Bundle()
            datos.putString("tCampo1", "@string/Product")
            datos.get("hCampo1")
            datos.putString("tCampo2", "b")
            datos.get("hCampo2")
            datos.putString("tCampo3", "a")
            datos.get("hCampo3")
            datos.putString("bEnter","Ingreso")
 //           @string/Product   @string/Description

            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainerView, DetailFragment::class.java, datos, "datail")
                ?.addToBackStack("")
                ?.commit()
        }

        detail2.setOnClickListener {
            val datos = Bundle()
            datos.putString("tCampo1", "@string/Code")
            datos.get("hCampo1")
            datos.putString("tCampo2", "@string/Date")
            datos.get("hCampo2")
            datos.putString("tCampo3", "@string/Value")
            datos.get("hCampo3")
            datos.putString("bEnter","registro")

            activity?.supportFragmentManager?.beginTransaction()
              ?.replace(R.id.fragmentContainerView, DetailFragment::class.java, datos, "datail")

//                ?.replace(R.id.nav_host_fragment_content_drawer, DetailFragment::class.java, datos, "datail")
                ?.addToBackStack("")
                ?.commit()
        }

        return fragmento
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ToDoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ToDoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}