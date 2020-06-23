package com.lush_digital_.simpleInterfaceExample.example3.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin



fun startDependencyInjectionFramework(application: Application) {
    startKoin {
        androidContext(application)
        modules(appModule)
    }
}