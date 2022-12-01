package com.albertoherjim.rssaggregator.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.albertoherjim.rssaggregator.R
import com.albertoherjim.rssaggregator.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    private var  binding:FragmentProfileBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater)
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

}