package com.ventadecortinas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {
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
        val fragmento =  inflater.inflate(R.layout.fragment_detail, container, false)
        var tCampo1 = requireArguments().getString("tCampo1")
        var hCampo1 = requireArguments().getString("hCampo1")
        var tCampo2 = requireArguments().getString("tCampo2")
        var hCampo2 = requireArguments().getString("hCampo2")
        var tCampo3 = requireArguments().getString("tCampo3")
        var hCampo3 = requireArguments().getString("hCampo3")
        var bEnter = requireArguments().getString("bEnter")
        var txtView_1: TextView = fragmento.findViewById(R.id.txtView_1)
        var edtView_1: TextView = fragmento.findViewById(R.id.edtView_1)
        var txtView_2: TextView = fragmento.findViewById(R.id.txtView_2)
        var edtView_2: TextView = fragmento.findViewById(R.id.edtView_2)
        var txtView_3: TextView = fragmento.findViewById(R.id.txtView_3)
    var edtView_3: TextView = fragmento.findViewById(R.id.edtView_3)
        var btnIngreso: TextView = fragmento.findViewById(R.id. btnIngreso)

        txtView_1.text = tCampo1
        edtView_1.text = hCampo1
        txtView_2.text = tCampo2
        edtView_2.text = hCampo2
        txtView_3.text = tCampo3
        edtView_3.text = hCampo3
        btnIngreso.text = bEnter
        return fragmento
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DetailFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DetailFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}