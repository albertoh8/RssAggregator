package com.albertoherjim.rssaggregator.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.albertoherjim.rssaggregator.R
import com.albertoherjim.rssaggregator.data.local.db.RssDao
import com.albertoherjim.rssaggregator.data.local.db.RssDbLocalDataSource
import com.albertoherjim.rssaggregator.databinding.FragmentBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class RssBottomSheetFragment : BottomSheetDialogFragment() {

    var binding: FragmentBottomSheetBinding? = null
    val localDataSource: RssDbLocalDataSource? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomSheetBinding.inflate(inflater)
        return inflater.inflate(R.layout.fragment_bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        saveBottom()
    }

    companion object {
        const val TAG = "BottomSheet"
    }

    private fun saveBottom() {
        binding?.bottomSheetView?.setOnClickListener{
            when(it.id){
                R.id.bottom_save -> addRss()
            }
            true
        }
    }

    private fun addRss() {
        val name = R.id.insert_name.toString()
        val url = R.id.insert_url.toString()
        localDataSource?.createRss(name, url)
    }
}