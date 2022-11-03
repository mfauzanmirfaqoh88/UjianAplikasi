package com.fauzan.ujianaplikasi

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
        private val JUMLAH_MENU = 3

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> { return DataSiswaFragment()}
            1 -> { return HomeFragment()}
            2 -> { return ProfileFragment()}
            else -> { return HomeFragment()}
        }
    }

    override fun getItemCount(): Int {
        return JUMLAH_MENU
    }
}