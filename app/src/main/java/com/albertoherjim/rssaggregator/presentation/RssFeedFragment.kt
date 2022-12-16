package com.albertoherjim.rssaggregator.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.albertoherjim.rssaggregator.R
import com.albertoherjim.rssaggregator.databinding.FragmentRssFeedBinding

class RssFeedFragment : Fragment() {

    private var binding: FragmentRssFeedBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRssFeedBinding.inflate(inflater)
        return inflater.inflate(R.layout.fragment_rss_feed, container, false)
    }



}