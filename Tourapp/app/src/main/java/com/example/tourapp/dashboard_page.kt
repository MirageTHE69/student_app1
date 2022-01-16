package com.example.tourapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tourapp.Adpater.packageAdpater
import com.example.tourapp.model.package_model
import com.google.firebase.firestore.FirebaseFirestore




class dashboard_page : Fragment() {

    private lateinit var adapter: packageAdpater;
    lateinit var recyclerView: RecyclerView
    lateinit var vm: ViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view :View = inflater.inflate(R.layout.fragment_dashboard_page, container, false)

        recyclerView =view.findViewById(R.id.rcview1)


        val db = FirebaseFirestore.getInstance()



        return  view;

    }


    fun setUpRecyclerView() {

        adapter = packageAdpater(listOf<package_model>())

        //  recyclerView.setAdapter(adapter);
        recyclerView.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.adapter = adapter;


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()
    }
}

