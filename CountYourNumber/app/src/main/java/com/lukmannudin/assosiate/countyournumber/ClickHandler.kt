package com.lukmannudin.assosiate.countyournumber

import android.view.View
import android.widget.Toast

data class ClickHandler (val calculator: Calculator){
    fun onClick(view:View){
        Toast.makeText(view.context,"Input1: "+ calculator.input1
                + " Input2: "+calculator.input2, Toast.LENGTH_SHORT)
            .show()
    }
}