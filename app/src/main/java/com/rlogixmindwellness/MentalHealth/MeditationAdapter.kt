package com.rlogixmindwellness.MentalHealth

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyAdapter(private val myContext: Context, fm: FragmentManager, internal var totalTabs: Int) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
         return when (position) {
             0 -> {
                  VideoFragment()
             }

             1 -> {
                  TextFragment()
             }
             else -> getItem(position)
         }
    }

    // this counts total number of tabs
    override fun getCount(): Int {
        return totalTabs
    }
}