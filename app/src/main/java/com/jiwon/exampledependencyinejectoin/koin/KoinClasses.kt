package com.jiwon.exampledependencyinejectoin.koin

import android.util.Log

private const val TAG = "koin_test"

class MySimplePresenter(val repo : MyHelloRepository){
    fun hello() : String {
        return "${repo.hello()} from this"
    }
}

class MyController(val myService : MyService){
    fun hello(){
        myService.sayHello()
    }
}
class MyService(){
    fun sayHello(){
        Log.d(TAG, "hello")
    }
}

interface MyHelloRepository{
    fun hello() : String
}

class MyHelloRepositoryImpl(private val myData : MyData) : MyHelloRepository{
    override fun hello(): String {
        return "Hey, ${myData.msg}"
    }
}

data class MyData(val msg : String = "Hello Koin")