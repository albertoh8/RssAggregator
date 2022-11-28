package com.albertoherjim.rssaggregator.data.local.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


const val TABLE_NAME = "Rss"

@Entity(tableName = TABLE_NAME)

data class RssEntity(

    @ColumnInfo(name = "Name") val Name: String,
    @PrimaryKey val url: String
)