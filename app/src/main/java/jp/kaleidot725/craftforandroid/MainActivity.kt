package jp.kaleidot725.craftforandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import im.delight.android.webview.AdvancedWebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<AdvancedWebView>(R.id.web_view)
        webView.setDesktopMode(true)
        webView.settings.builtInZoomControls = false
        webView.settings.displayZoomControls = false
        webView.loadUrl("https://docs.craft.do")
    }
}