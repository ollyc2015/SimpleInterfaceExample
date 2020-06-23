package com.lush_digital_.simpleInterfaceExample.example3.di

import android.app.Application

class InterfaceExample: Application() {

    override fun onCreate() {
        super.onCreate()
        startDependencyInjectionFramework(this)
    }
}