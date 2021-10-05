package com.jiwon.exampledependencyinejectoin.koin

import android.widget.Toast
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class KoinAppliation : KoinComponent{
    // Inject HelloService
    val helloService by inject<HelloService>()
    fun sayHello() = println(helloService.hello())
}