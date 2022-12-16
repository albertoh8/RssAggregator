package com.albertoherjim.rssaggregator.data.local

interface RssLocalDataSource {
    fun createRss(name:String, url:String)
}