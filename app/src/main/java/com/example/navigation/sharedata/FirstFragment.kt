package com.example.navigation.sharedata

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.navigation.R
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment() {
    val model: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.v("pxd","$model")

        firtTextView.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_detailFragment)
        }

        model.number.observe(viewLifecycleOwner){
            firtTextView.text = "${firtTextView.text}.$it"
        }
    }
}







