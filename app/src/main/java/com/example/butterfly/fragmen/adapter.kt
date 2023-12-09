package com.example.butterfly.fragmen

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.butterfly.R

class adapter(private val context: Context, private val menu: List<menu>, val listener: (menu) -> Unit)
    : RecyclerView.Adapter<adapter.menuViewHolder>() {
    class menuViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val gambar = view.findViewById<ImageView>(R.id.gambar)
        val nama = view.findViewById<TextView>(R.id.namabarang)
        val harga = view.findViewById<TextView>(R.id.hargabarang)
        val cardView = view.findViewById<CardView>(R.id.card_view)

        fun bindView(pmi2: menu, listener: (menu) -> Unit) {
            gambar.setImageResource(pmi2.image)
            nama.text = pmi2.namabarang
            harga.text = pmi2.hargabarang
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): menuViewHolder {
        return menuViewHolder(
            LayoutInflater.from(context).inflate(R.layout.daftar_menu, parent, false)
        )
    }
    override fun onBindViewHolder(holder: menuViewHolder, position: Int) {
        holder.bindView(menu[position], listener)
        holder.cardView.setOnClickListener{
            val context1 = holder.itemView.context
            val intent= Intent(context1,ProfileFragment::class.java).apply {
                putExtra("ITEM_ID",position)
            }
            context1.startActivity(intent)
        }
    }
    override fun getItemCount(): Int = menu.size
}