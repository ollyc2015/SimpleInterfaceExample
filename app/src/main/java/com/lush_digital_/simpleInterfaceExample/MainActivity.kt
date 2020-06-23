package com.lush_digital_.simpleInterfaceExample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lush_digital_.simpleInterfaceExample.example1.ExampleOneFragment

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_container)

        showFirstExample()
    }

    private fun showFirstExample(){
        if(supportFragmentManager.fragments.size == 0){
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.fragment_container,
                    ExampleOneFragment(),
                    "MainFragment"
                )
                .commit()
        }
    }


}