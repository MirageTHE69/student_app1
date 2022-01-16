package com.example.tourapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class verification_page : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View = inflater.inflate(R.layout.fragment_verification_page, container, false)

        val next_to_dashboard : Button = view.findViewById(R.id.Next_to_Dashboard)

        next_to_dashboard.setOnClickListener {

            it.findNavController().navigate(R.id.dashboard_page)
        }


        // Inflate the layout for this fragment
        return view
    }


}