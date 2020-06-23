package com.lush_digital_.simpleInterfaceExample.example3.processor

import com.lush_digital_.simpleInterfaceExample.example3.ExampleThreeInterface

interface ExampleThreeProcessor {

    fun attachView(view: ExampleThreeInterface)
    fun handleClick()
}