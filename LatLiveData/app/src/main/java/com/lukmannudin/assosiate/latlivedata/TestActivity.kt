package com.lukmannudin.assosiate.latlivedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class TestActivity : AppCompatActivity() {

    private lateinit var model: TestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)


    }
}
