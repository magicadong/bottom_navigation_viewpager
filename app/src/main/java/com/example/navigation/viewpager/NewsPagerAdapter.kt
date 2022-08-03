package com.example.navigation.viewpager

import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter

class NewsPagerAdapter(
    val fragmentList: List<Fragment>,
    fm: FragmentManager,
    lifeCycle: Lifecycle
): FragmentStateAdapter(fm,lifeCycle){
    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}