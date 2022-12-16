package com.albertoherjim.rssaggregator.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.findNavController
import com.albertoherjim.rssaggregator.R
import com.albertoherjim.rssaggregator.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.albertoherjim.rssaggregator.NavGraphDirections
import com.albertoherjim.rssaggregator.data.local.db.RssDbLocalDataSource
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    val localDataSource: RssDbLocalDataSource? = null

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
            when (it.itemId) {
                R.id.rss -> navToFeed()
                R.id.manage -> navToManagment()
                R.id.profile -> navToProfile()

            }
            true
        }
    }

    private fun setupToolbar() {
        binding?.myToolbar?.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.btn_add_rss -> showBottomSheet()
            }
            true
        }

    }

    private fun navToFeed() {
        findNavController(R.id.nav_host_fragment).navigate(NavGraphDirections.toFeed())
    }

    private fun navToManagment() {
        findNavController(R.id.nav_host_fragment).navigate(NavGraphDirections.toManagment())
    }

    private fun navToProfile() {
        findNavController(R.id.nav_host_fragment).navigate(NavGraphDirections.toProfile())
    }

    private fun showBottomSheet() {
        val bottomSheet = RssBottomSheetFragment()
        bottomSheet.show(supportFragmentManager, bottomSheet.tag)
    }


}