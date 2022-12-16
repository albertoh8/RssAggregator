package com.albertoherjim.rssaggregator.presentation

import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.findNavController
import com.albertoherjim.rssaggregator.R
import com.albertoherjim.rssaggregator.databinding.FragmentRssManagmentBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class RssManagmentFragment : Fragment() {

    private var binding: FragmentRssManagmentBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRssManagmentBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}