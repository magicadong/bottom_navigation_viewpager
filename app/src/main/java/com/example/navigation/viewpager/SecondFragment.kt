package com.example.navigation.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.navigation.R
import com.example.navigation.sharedata.FirstFragment
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val viewPager = view.findViewById<ViewPager2>(R.id.secondViewPager)

        viewPager.adapter = NewsPagerAdapter(
            listOf(PageOneFragment(),PageTwoFragment(),PageThreeFragment()),
            requireActivity().supportFragmentManager,
            this.lifecycle
        )
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.currentItem = 0
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}