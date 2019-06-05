package com.lukmannudin.assosiate.latlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestViewModel : ViewModel() {

    // Create a LiveData with a String
    val currentName: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    // Rest of the ViewModel...
}