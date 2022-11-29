package com.albertoherjim.rssaggregator.data.local.db

import com.albertoherjim.rssaggregator.data.local.RssLocalDataSource

class RssDbLocalDataSource(private val dao: RssDao):RssLocalDataSource {

    override fun createRss(name: String, url: String) {
        dao.create(RssEntity(name,url))
    }
}