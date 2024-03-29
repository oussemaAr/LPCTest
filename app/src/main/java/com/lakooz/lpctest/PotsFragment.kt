package com.lakooz.lpctest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lakooz.lpctest.databinding.PotsFragmentBinding

class PotsFragment : Fragment() {

    private lateinit var binding: PotsFragmentBinding

    private lateinit var viewModel: PotsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        val binding = PotsFragmentBinding.inflate(inflater, container, false)

        // set up recycler view

        // TODO : set up view model

        return binding.root
    }
}