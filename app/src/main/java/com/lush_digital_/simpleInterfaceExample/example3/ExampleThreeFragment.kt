package com.lush_digital_.simpleInterfaceExample.example3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.lush_digital_.simpleInterfaceExample.R
import com.lush_digital_.simpleInterfaceExample.example3.processor.ExampleThreeProcessor
import kotlinx.android.synthetic.main.example_three_fragment.*
import org.koin.android.ext.android.inject

class ExampleThreeFragment: Fragment(), ExampleThreeInterface {

    private lateinit var viewModel: ExampleThreeViewModel
    private val processorImpl: ExampleThreeProcessor by inject()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.example_three_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ExampleThreeViewModel::class.java)
        init()
    }

    private fun init(){

        processorImpl.attachView(this)
        buttonClick()
        observeViewModel()

    }

    override fun buttonClick(){

        example_three_button.setOnClickListener {

            processorImpl.handleClick()
        }
    }

    override fun showPretendLoadingMessage() {
        Toast.makeText(context, "Loading...", Toast.LENGTH_SHORT).show()
        viewModel.pretendServerResponse()
    }

    private fun observeViewModel() {
        viewModel.returnOKString()?.observe(viewLifecycleOwner, Observer {

            Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
        })
    }
}