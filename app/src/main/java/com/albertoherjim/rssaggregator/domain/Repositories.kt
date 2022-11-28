package com.albertoherjim.rssaggregator.domain

interface RssRepository {
    fun create(name:String, url:String)
}