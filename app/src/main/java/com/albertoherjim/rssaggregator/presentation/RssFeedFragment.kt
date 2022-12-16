package com.albertoherjim.rssaggregator.presentation

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.albertoherjim.rssaggregator.R
import com.albertoherjim.rssaggregator.databinding.FragmentRssFeedBinding

class RssFeedFragment : Fragment() {

    private var binding: FragmentRssFeedBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRssFeedBinding.inflate(inflater)
        return inflater.inflate(R.layout.fragment_rss_feed, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu, menu)

    }



}