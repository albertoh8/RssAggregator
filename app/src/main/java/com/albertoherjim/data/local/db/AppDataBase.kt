package com.albertoherjim.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.albertoherjim.rssaggregator.data.local.db.RssDao
import com.albertoherjim.rssaggregator.data.local.db.RssEntity


@Database(entities = [RssEntity::class], version = 1)
abstract class AppDataBase: RoomDatabase() {
    abstract fun rssDao(): RssDao
}