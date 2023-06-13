package com.kiro.weatherapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kiro.weatherapp.R
import com.kiro.weatherapp.databinding.FragmentMoonBinding

class MoonFragment : Fragment() {
    private lateinit var binding: FragmentMoonBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMoonBinding.inflate(layoutInflater)
        return inflater.inflate(R.layout.fragment_moon, container, false)
    }


}