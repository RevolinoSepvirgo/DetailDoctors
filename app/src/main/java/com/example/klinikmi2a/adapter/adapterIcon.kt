package com.example.klinikmi2a.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.klinikmi2a.Display
import com.example.klinikmi2a.R
import com.example.klinikmi2a.model.ModelMenuIcon

class adapterIcon (

    val itemList: ArrayList<ModelMenuIcon>,
    val getActivity : Display
): RecyclerView.Adapter<adapterIcon.MyViewHolder>(){


    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView)  {
        var itemImage : ImageView
        var itemJudul : TextView

        init {
            itemImage =itemView.findViewById(R.id.imgMenu) as ImageView
            itemJudul =itemView.findViewById(R.id.namaMenu) as TextView
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].gambar)
        holder.itemJudul.setText(itemList[position].judul)
    }
}


