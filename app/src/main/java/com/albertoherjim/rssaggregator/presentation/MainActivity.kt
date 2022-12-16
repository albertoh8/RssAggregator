package com.albertoherjim.rssaggregator.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.albertoherjim.rssaggregator.R
import com.albertoherjim.rssaggregator.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.albertoherjim.rssaggregator.NavGraphDirections


class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupBinding()
        setupNavigation()

    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding?.let {
            setContentView(it.root)
        }
    }


    private fun setupNavigation() {
        binding?.bottomNavigationMenu?.setOnItemSelectedListener {
            when(it.itemId){
                R.id.rss -> navToFeed()
                R.id.manage -> navToManagment()
                R.id.profile -> navToProfile()
            }
            true
        }
    }

    fun navToFeed() {
        findNavController(R.id.nav_host_fragment).navigate(NavGraphDirections.toFeed())
    }

    fun navToManagment() {
        findNavController(R.id.nav_host_fragment).navigate(NavGraphDirections.toManagment())
    }

    fun navToProfile() {
        findNavController(R.id.nav_host_fragment).navigate((NavGraphDirections.toProfile()))
    }
}