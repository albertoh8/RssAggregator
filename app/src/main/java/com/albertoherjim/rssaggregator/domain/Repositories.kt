package com.albertoherjim.rssaggregator.domain

interface RssRepository {
    fun create(rss: Rss)
}