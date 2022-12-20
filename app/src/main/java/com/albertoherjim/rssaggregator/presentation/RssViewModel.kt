package com.albertoherjim.rssaggregator.presentation


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import androidx.lifecycle.MutableLiveData
import com.albertoherjim.rssaggregator.domain.SaveRssUseCase

class RssViewModel(private val saveRss: SaveRssUseCase) : ViewModel() {

    val rssPublisher: MutableLiveData<SaveRssUseCase> by lazy {
        MutableLiveData<SaveRssUseCase>()
    }

    fun saveRss(name: String, url: String) {

        viewModelScope.launch(Dispatchers.IO) {
            val rss = saveRss.execute(name, url)
            rssPublisher.postValue(rss)
        }
    }

}

private fun <T> MutableLiveData<T>.postValue(rss: Unit) {}




