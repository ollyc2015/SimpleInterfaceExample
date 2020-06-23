package com.lush_digital_.simpleInterfaceExample.example3

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//This is where network calls would be made
class ExampleThreeViewModel : ViewModel(){

    //live data to listen to when delay has been completed
    private var fakeServerString: MutableLiveData<String>? = null

    fun pretendServerResponse() {

        GlobalScope.launch { // launch new coroutine in background and continue
            delay(3000L) // non-blocking delay for 3 second (default time unit is ms)
            // print after delay
            fakeServerString?.postValue("Server Response 200")

        }
    }

    fun returnOKString(): MutableLiveData<String>? {
        if (fakeServerString == null) {
            fakeServerString = MutableLiveData()
        }
        return fakeServerString
    }
}

