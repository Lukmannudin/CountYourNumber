package com.lukmannudin.assosiate.simpleloginui

import android.view.View
import android.widget.Toast

data class LoginHandler(val user: User){
    fun buttonLoginClick(view: View){
        Toast.makeText(view.context, "First name is: "
            + user.firstName + " Last name is " + user.lastName + " and password is"
        + user.password, Toast.LENGTH_SHORT).show()
    }
}