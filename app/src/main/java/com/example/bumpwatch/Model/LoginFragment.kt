package com.example.bumpwatch.Model

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bumpwatch.R
import com.google.android.material.button.MaterialButton
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_login, container, false)

        val view = inflater.inflate(R.layout.fragment_login, container, false)
        val button = view.findViewById<MaterialButton>(R.id.next_button)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_dashboardFragment)
            //onSubmit()
        }
        return view
    }
}