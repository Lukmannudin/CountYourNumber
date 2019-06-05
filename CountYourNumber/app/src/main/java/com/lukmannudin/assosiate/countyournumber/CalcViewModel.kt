package com.lukmannudin.assosiate.countyournumber

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalcViewModel : ViewModel(){
    private val _input1 = MutableLiveData<Int>(0)
    val input1 : LiveData<Int> = _input1

//    private val _cek = MutableLiveData<Int>("SA")
//    val cek : LiveData<Int> =_cek

    private val _input2 = MutableLiveData<Int>(0)
    val input2 : LiveData<Int> = _input2

//    private val _answer = MutableLiveData<Int>(0)
    private val _answer =  MutableLiveData(0)

    //    val answer : LiveData<Int> = _answer
    val answer: MutableLiveData<Int> = _answer

    fun setInput1(input:Int){
        _input1.value = input
    }

    fun setInput2(input: Int){
        _input2.value = input
    }

    fun incrementLikes(){
        answer.value = (answer.value ?: 0) + 1
    }

    fun setOperator(operator:String){
        when (operator){
            "+"-> _answer.value = _input1.value?.plus(_input2.value!!)
            "-"-> _answer.value = _input1.value?.minus(_input2.value!!)
            "/"-> _answer.value = _input1.value?.div(_input2.value!!)
            "*"-> _answer.value = _input1.value?.times(_input2.value!!)
        }
    }

}
