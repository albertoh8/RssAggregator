package com.albertoherjim.rssaggregator.presentation

import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.albertoherjim.rssaggregator.R
import com.albertoherjim.rssaggregator.databinding.FragmentRssManagmentBinding

class RssManagmentFragment : Fragment() {

    private var binding: FragmentRssManagmentBinding? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRssManagmentBinding.inflate(inflater)
        return binding?.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu, menu)

    }

    fun setupView() {
        binding?.root.apply {

        }
    }

    fun navToBottomSheet() {
        findNavController().navigate(RssManagmentFragmentDirections.actionToBottomSheet())
    }
}