package com.jiwon.exampledependencyinejectoin.koin

import org.koin.dsl.module


val myModule = module{
    single { MyService() }

    // get() -> program automatically fills in necessary parameters
    single { MyController(get()) }
}

val helloModule = module{
    single{ MyData() }
    single<MyHelloRepository>{ MyHelloRepositoryImpl(get()) }
    factory { MySimplePresenter(get()) }
}