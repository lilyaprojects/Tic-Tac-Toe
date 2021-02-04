package com.example.tz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.webkit.WebView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var webView: WebView? = null
    lateinit var startNewGameButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        startNewGameButton = findViewById(R.id.startNewGameButton)
        startNewGameButton.setOnClickListener {
            val intent = Intent(MainActivity@this, GameActivity::class.java)
            startActivity(intent)
        }
        webView = findViewById<View>(R.id.webView) as WebView
        val webSettings = webView!!.settings
        webSettings.javaScriptEnabled = true
        webView!!.loadUrl("https://scnddmn.com/7vZTBtvQ?sub1=google")
    }
    override fun onKeyDown(keyCode: Int, event: KeyEvent): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK && webView!!.canGoBack()) {
            webView!!.goBack()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }
}