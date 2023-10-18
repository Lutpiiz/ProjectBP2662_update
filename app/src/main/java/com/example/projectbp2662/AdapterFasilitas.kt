package com.example.projectbp2662

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterFasilitas (private val listFasilitas:List<FasilitasModel>):
    RecyclerView.Adapter<AdapterFasilitas.ViewHolder>(){

    class ViewHolder(ItemView: View):RecyclerView.ViewHolder(ItemView){
        val image: ImageView = itemView.findViewById(R.id.perpus)
        val title: TextView = itemView.findViewById(R.id.title)
        val desc1: TextView = itemView.findViewById(R.id.desc1)
        val desc2: TextView = itemView.findViewById(R.id.desc2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterFasilitas.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout_fasilitas, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val modelFasilitas = listFasilitas[position]

        holder.image.setImageResource(modelFasilitas.image)
        holder.title.text = modelFasilitas.title
        holder.desc1.text = modelFasilitas.desc1
        holder.desc2.text = modelFasilitas.desc2
    }

    override fun getItemCount(): Int {
        return listFasilitas.size
    }

}