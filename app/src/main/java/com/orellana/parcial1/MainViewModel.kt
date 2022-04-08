package com.orellana.parcial1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var username = MutableLiveData("")
    var carnet = MutableLiveData("")
    var money = MutableLiveData("")



}