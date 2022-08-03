package com.example.navigation.sharedata

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.navigation.R
import kotlinx.android.synthetic.main.fragment_detail.*


class DetailFragment : Fragment() {
    val model: SharedViewModel by activityViewModels<SharedViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.v("pxd","$model")

        model.number.observe(viewLifecycleOwner){
            detailTextView.text = "Detail.$it"
        }

        detailTextView.setOnClickListener {
            model.number.postValue(model.number.value!! + 1)
        }
    }


}