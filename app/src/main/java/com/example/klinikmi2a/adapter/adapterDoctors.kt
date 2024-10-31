package com.example.klinikmi2a.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.klinikmi2a.Detail
import com.example.klinikmi2a.Display
import com.example.klinikmi2a.R
import com.example.klinikmi2a.model.ModelLIstDoctors

class adapterDoctors (


    val itemList: ArrayList<ModelLIstDoctors>,
    val getActivity: Display
): RecyclerView.Adapter<adapterDoctors.MyViewHolder>()
{
    class MyViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        var itemGambar : ImageView
        var itemNama : TextView
        var itemSpesialis : TextView
        var itemReview : TextView
        var itemNilai : TextView

        init {
            itemGambar = itemView.findViewById(R.id.imgDoctors ) as ImageView
            itemNama = itemView.findViewById(R.id.namaDoctors) as TextView
            itemSpesialis = itemView.findViewById(R.id.spesDoctors) as TextView
            itemReview = itemView.findViewById(R.id.jumlahReview) as TextView
            itemNilai = itemView.findViewById(R.id.angkaRating) as TextView
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_listdoctors, parent,false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemGambar.setImageResource(itemList[position].imgDoctors)
        holder.itemNama.setText(itemList[position].namaDoctors)
        holder.itemSpesialis.setText(itemList[position].spesDoctors)
        holder.itemReview.setText(itemList[position].jumlahReview)
        holder.itemNilai.setText(itemList[position].angkaRating)
        // Set click listener untuk item
        holder.itemView.setOnClickListener {
            // Buat Intent untuk menuju PageDokterActivity
            val intent = Intent(holder.itemView.context, Detail::class.java)
            // Kirim data yang diperlukan ke Activity berikutnya
            intent.putExtra("imageResId",itemList[position].imgDoctors)
            intent.putExtra("namaDokter",itemList[position].namaDoctors)
            intent.putExtra("spesialis", itemList[position].spesDoctors)
            intent.putExtra("jumlahRating",itemList[position].jumlahReview)
            intent.putExtra("rating",itemList[position].angkaRating)
            // Mulai activity
            holder.itemView.context.startActivity(intent)
        }
    }

}
