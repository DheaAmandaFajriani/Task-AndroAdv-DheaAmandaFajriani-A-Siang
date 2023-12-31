package com.example.butterfly.fragmen

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.butterfly.menuFragment
import com.example.butterfly.popularmenuFragment

class viewpagAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {


    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                popularmenuFragment()
            }
            else -> {
                menuFragment()
            }
        }
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "Popular Menu"
            else -> {
                return "All Menu"
            }
        }
    }
    }
