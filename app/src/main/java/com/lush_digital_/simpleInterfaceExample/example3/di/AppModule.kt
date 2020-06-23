package com.lush_digital_.simpleInterfaceExample.example3.di

import com.lush_digital_.simpleInterfaceExample.example3.processor.ExampleThreeProcessor
import com.lush_digital_.simpleInterfaceExample.example3.processor.ExampleThreeProcessorImpl
import org.koin.dsl.module

val appModule = module {

    factory<ExampleThreeProcessor> { ExampleThreeProcessorImpl() }

}