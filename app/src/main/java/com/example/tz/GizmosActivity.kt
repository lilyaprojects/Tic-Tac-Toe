package com.example.tz

import android.app.Activity
import android.os.Bundle
import android.util.Log

class GizmosActivity : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = intent
        val action = intent.action
        val data = intent.data
        Log.v(TAG, action + " " + data.toString())
    }

    companion object {
        var TAG = "debug"
    }
}