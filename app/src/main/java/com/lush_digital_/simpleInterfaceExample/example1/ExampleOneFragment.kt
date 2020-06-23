package com.lush_digital_.simpleInterfaceExample.example1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.lush_digital_.simpleInterfaceExample.R
import com.lush_digital_.simpleInterfaceExample.example2.ExampleTwoFragment
import com.lush_digital_.simpleInterfaceExample.example3.ExampleThreeFragment
import kotlinx.android.synthetic.main.example_one_fragment.*


class ExampleOneFragment : Fragment() {

    private var pressed = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.example_one_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        init()
    }

    private fun init(){
        getText()
        exampleTwoButton()
        exampleThreeButton()
    }

    private fun getText() {

        val text = ExampleOneImpl(hello_world)

        text.setOnProductClickListener(object : ExampleOneInterface {
            override fun onClickListener(view: View?) {

                val myButton = view as Button

                setButtonText(myButton)

                Toast.makeText(context, myButton.text.toString(), Toast.LENGTH_SHORT)
                    .show()
            }
        })
    }

    private fun setButtonText(myButton: Button) {
        if (!pressed) {
            myButton.text = "Kotlin is cool!"
            pressed = true
        } else {
            myButton.text = "So are Interfaces!"
            pressed = false
        }
    }

    private fun exampleTwoButton(){

        example_two_button.setOnClickListener {
            goToFragment(ExampleTwoFragment())
        }
    }

    private fun exampleThreeButton(){

        example_three_button.setOnClickListener {
            goToFragment(ExampleThreeFragment())
        }
    }

    private fun goToFragment(fragment: Fragment) {

        val transaction: FragmentTransaction? = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.fragment_container, fragment)
        transaction?.addToBackStack(null)
        transaction?.commit()

    }
}