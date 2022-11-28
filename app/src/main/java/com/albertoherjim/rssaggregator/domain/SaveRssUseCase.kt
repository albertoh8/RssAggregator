package com.albertoherjim.rssaggregator.domain

class SaveRssUseCase(private val rssRepository: RssRepository) {

    fun execute(name: String, url: String) {
        rssRepository.create(name,url)
    }
}