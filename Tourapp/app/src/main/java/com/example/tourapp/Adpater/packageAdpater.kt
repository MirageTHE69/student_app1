package com.example.tourapp.Adpater

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.tourapp.R
import com.example.tourapp.model.package_model

class packageAdpater(private  val packageList : List<package_model> ) :
    RecyclerView.Adapter<packageAdpater.packageViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): packageViewHolder {

        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.package_card,parent,false)

        return packageViewHolder(itemview)

    }

    override fun onBindViewHolder(holder: packageViewHolder, position: Int) {

        val currentitem = packageList[position]
        holder.packagename.text = currentitem.package_name

        currentitem.package_img?.let { holder.packageimage.setImageResource(it) }


    }

    override fun getItemCount(): Int {

        return packageList.size
    }



    class packageViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview){

        val packageimage : ImageView = itemview.findViewById(R.id.package_img)
        val packagename : TextView = itemview.findViewById(R.id.package_name)
        val packagecard : CardView = itemview.findViewById(R.id.package_card)

    }

}