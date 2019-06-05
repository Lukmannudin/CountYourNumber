package com.lukmannudin.assosiate.simpleloginui

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class User : BaseObservable() {

    @get:Bindable
    var firstName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.firstName)
        }

    @get:Bindable
    var lastName: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.lastName)
        }

    @get:Bindable
    var password: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.password)
        }

    fun checkInput(firstName:String,lastName:String, password:String): Boolean{
        if (firstName.isEmpty() || lastName.isEmpty() || password.isEmpty()){
            return false
        }
        return !firstName.isEmpty() && !lastName.isEmpty() && !password.isEmpty()
    }
}