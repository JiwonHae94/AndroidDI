package com.jiwon.exampledependencyinejectoin.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jiwon.exampledependencyinejectoin.R
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class KoinActivity : AppCompatActivity(), KoinComponent{
    private val TAG = KoinActivity::class.java.simpleName

    val helloService by inject<MyHelloRepository>()
    fun sayHello() = Log.d(TAG, helloService.hello())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koin)

    }
}