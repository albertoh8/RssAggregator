package com.albertoherjim.rssaggregator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.albertoherjim.rssaggregator.data.remote.api.ApiClient
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

}