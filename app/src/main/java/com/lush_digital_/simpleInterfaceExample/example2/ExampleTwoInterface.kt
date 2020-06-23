package com.lush_digital_.simpleInterfaceExample.example2

interface ExampleTwoInterface {

    interface View {
        fun handleButtonClick()
        fun showToastMessage()
    }

    interface Presenter{

        fun attachView(view: View)
        fun handleButtonClick()
    }
}