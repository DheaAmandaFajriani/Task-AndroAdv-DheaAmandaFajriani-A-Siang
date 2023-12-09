package com.example.butterfly.fragmen

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.butterfly.R
import com.example.butterfly.databinding.DaftarMenuBinding

class menuAdapter(private val item: ArrayList<menu>) : RecyclerView.Adapter<menuAdapter.ViewHolder>(){


    class ViewHolder(val binding: DaftarMenuBinding) : RecyclerView.ViewHolder(binding.root) {
        val image :ImageView = itemView.findViewById(R.id.gambar)
        val harga :TextView = itemView.findViewById(R.id.hargabarang)
        val nama : TextView = itemView.findViewById(R.id.namabarang)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            DaftarMenuBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int ) {
        val currenItem = item[position]
        holder.image.setImageResource(currenItem.image)
        holder.nama.text = (currenItem.namabarang)
        holder.harga.text = (currenItem.hargabarang)
    }




}