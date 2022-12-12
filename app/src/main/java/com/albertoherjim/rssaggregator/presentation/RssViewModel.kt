package com.albertoherjim.rssaggregator.presentation


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import androidx.lifecycle.MutableLiveData

class RssViewModel {

    val rssPublisher: MutableLiveData<RssUiState> by lazy {
        MutableLiveData<RssUiState>()
    }

    fun saveRss(name: String, url: String){
        rssPublisher.value = RssUiState(true)

    }

    data class RssUiState(
        val isSuccess:Boolean =false
    )
}