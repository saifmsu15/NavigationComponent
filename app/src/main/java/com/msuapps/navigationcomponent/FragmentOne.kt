package com.msuapps.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FragmentOne : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_one, container, false)

        val btn_FragmentOne = view.findViewById(R.id.btn_FragmentOne) as Button
        btn_FragmentOne.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentOne_to_fragmentTwo)
        }

        return view
    }
}