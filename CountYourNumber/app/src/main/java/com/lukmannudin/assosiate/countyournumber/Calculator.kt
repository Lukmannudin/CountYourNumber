package com.lukmannudin.assosiate.countyournumber

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class Calculator : BaseObservable(){
    @get:Bindable
    var input1: Int = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.input1)
        }

    @get:Bindable
    var input2: Int = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.input2)
        }

    @get:Bindable
    var answer: Int = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.answer)
        }
}