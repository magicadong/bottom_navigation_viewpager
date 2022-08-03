package com.example.navigation.sharedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
    var number = MutableLiveData(0)
}