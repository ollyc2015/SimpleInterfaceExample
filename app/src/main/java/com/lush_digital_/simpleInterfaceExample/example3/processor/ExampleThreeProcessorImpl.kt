package com.lush_digital_.simpleInterfaceExample.example3.processor

import com.lush_digital_.simpleInterfaceExample.example3.ExampleThreeInterface

class ExampleThreeProcessorImpl : ExampleThreeProcessor{

    private var view: ExampleThreeInterface? = null

    override fun attachView(view: ExampleThreeInterface) {
        this.view = view
    }

    override fun handleClick() {
        view?.showPretendLoadingMessage()
    }


}