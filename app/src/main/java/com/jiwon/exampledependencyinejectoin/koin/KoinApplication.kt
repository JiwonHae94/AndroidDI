package com.jiwon.exampledependencyinejectoin.koin

import android.app.Application
import android.util.Log
import org.koin.android.ext.koin.androidContext
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import org.koin.dsl.module

class KoinApplication : Application(), KoinComponent {
    private val TAG = KoinApplication::class.java.simpleName

    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@KoinApplication)
            modules(myModule, helloModule)
        }


    }
}