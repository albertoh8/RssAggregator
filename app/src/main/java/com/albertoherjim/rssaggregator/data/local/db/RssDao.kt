package com.albertoherjim.rssaggregator.data.local.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy


@Dao
interface RssDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun create(rss:RssEntity)
}