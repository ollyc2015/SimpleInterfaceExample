package com.lush_digital_.simpleInterfaceExample.example1

import android.widget.Button

class ExampleOneImpl(helloWorld: Button) {

    private lateinit var buttonClickListener: ExampleOneInterface

    init {

        helloWorld.setOnClickListener {

            buttonClickListener.onClickListener(it)
        }
    }

    fun setOnProductClickListener(buttonClickListener: ExampleOneInterface) {
        this.buttonClickListener = buttonClickListener
    }
}