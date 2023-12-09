package com.example.butterfly.fragmen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.butterfly.R

class adapter(private val context: Context, private val barang :List<menu>,val listener:(menu)->Unit):
    RecyclerView.Adapter<adapter.barangViewHolder>(){
    class barangViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val gambar = view.findViewById<ImageView>(R.id.gambar)
        val namabarang= view.findViewById<TextView>(R.id.namabarang)
        val hargabarang = view.findViewById<TextView>(R.id.hargabarang)

        fun bindingView(barang :menu,listener: (menu) -> Unit){
            gambar.setImageResource(barang.image)
            namabarang.text = barang.namabarang
            hargabarang.text = barang.hargabarang
            itemView.setOnClickListener{
                listener(barang)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): barangViewHolder {
        return barangViewHolder(
            LayoutInflater.from(context).inflate(R.layout.daftar_menu,parent,false)
        )
    }

    override fun onBindViewHolder(holder:barangViewHolder, position: Int) {
        holder.bindingView(barang[position],listener)
    }

    override fun getItemCount(): Int = barang.size
    }

