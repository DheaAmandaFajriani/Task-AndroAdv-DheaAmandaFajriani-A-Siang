package com.example.butterfly.fragmen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.butterfly.R


class HomeFragment : Fragment() {
    fun onCreate(view: View,savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val menuList = listOf<menu>(
            menu(
                R.drawable.img_1,
                "Ice cream",
                "Rp.20.000,00"
            ),
            menu(
                R.drawable.img_2,
                "Ice cream",
                "Rp.20.000"
            ),
            menu(
                R.drawable.img_3,
                "Ice Cream",
                "Rp.20.000"

            )
        )
        val recyclerView = view.findViewById<RecyclerView>(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter(this, menuList){

        }

    }

    private fun adapter(
        context: HomeFragment,
        menu: List<menu>,
        listener: (menu) -> Unit
    ): adapter {
        TODO("Not yet implemented")
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }









    }
