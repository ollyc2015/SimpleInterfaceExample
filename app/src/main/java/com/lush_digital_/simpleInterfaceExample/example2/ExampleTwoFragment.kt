package com.lush_digital_.simpleInterfaceExample.example2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.lush_digital_.simpleInterfaceExample.R
import kotlinx.android.synthetic.main.example_two_fragment.*

class ExampleTwoFragment : Fragment(), ExampleTwoInterface.View{

    private lateinit var viewModel: ExampleTwoTwoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.example_two_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ExampleTwoTwoViewModel::class.java)

        viewModel.attachView(this)
        handleButtonClick()
    }

    override fun handleButtonClick() {

        example_two_button.setOnClickListener {

            viewModel.handleButtonClick()

        }
    }

    override fun showToastMessage() {
        Toast.makeText(context, "Hello from Fragment", Toast.LENGTH_SHORT).show()
    }

}