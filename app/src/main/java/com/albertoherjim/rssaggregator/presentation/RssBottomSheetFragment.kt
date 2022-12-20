package com.albertoherjim.rssaggregator.presentation

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.room.Room
import com.albertoherjim.data.local.db.AppDataBase
import com.albertoherjim.rssaggregator.R
import com.albertoherjim.rssaggregator.data.local.db.RssDao
import com.albertoherjim.rssaggregator.data.local.db.RssDbLocalDataSource
import com.albertoherjim.rssaggregator.databinding.FragmentBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RssBottomSheetFragment : BottomSheetDialogFragment() {

    var binding: FragmentBottomSheetBinding? = null
    val viewModel: RssViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        setupView()
        binding = FragmentBottomSheetBinding.inflate(inflater)
        return binding?.root
    }

    companion object {
        const val TAG = "BottomSheet"
    }

    fun setupView() {
        binding?.apply {
            bottomSave?.setOnClickListener {
                viewModel?.saveRss(
                    insertName.text.toString(),
                    insertUrl.text.toString()
                )
                findNavController().navigateUp()
            }
            binding?.bottomCancel?.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }

}