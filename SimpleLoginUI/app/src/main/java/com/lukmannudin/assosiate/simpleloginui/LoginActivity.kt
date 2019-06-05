package com.lukmannudin.assosiate.simpleloginui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.lukmannudin.assosiate.simpleloginui.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var user: User
    private lateinit var handler: LoginHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding =
                DataBindingUtil.setContentView(this,R.layout.activity_login)

        user = User()
        handler = LoginHandler(user)
        binding.user = user
        binding.handler = LoginHandler(user)
    }



}
