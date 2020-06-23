package com.lush_digital_.simpleInterfaceExample.example2

import androidx.lifecycle.ViewModel

class ExampleTwoTwoViewModel : ViewModel() , ExampleTwoInterface.Presenter{

    private var view: ExampleTwoInterface.View? = null

    override fun attachView(view: ExampleTwoInterface.View) {
        this.view = view
    }

    override fun handleButtonClick() {

        view?.showToastMessage()
    }
}