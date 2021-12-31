package jp.kaleidot725.craftforandroid

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.KeyEvent.*
import im.delight.android.webview.AdvancedWebView

class MainActivity : AppCompatActivity() {
    private lateinit var webView: AdvancedWebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById<AdvancedWebView>(R.id.web_view)
        webView.setDesktopMode(true)
        webView.settings.builtInZoomControls = false
        webView.settings.displayZoomControls = false
        webView.loadUrl("https://docs.craft.do")
    }

    override fun onResume() {
        super.onResume()
        webView.onResume()
    }

    override fun onPause() {
        super.onPause()
        webView.onPause()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        webView.onActivityResult(requestCode, resultCode, intent)
    }

    override fun onBackPressed() {
        if (!webView.onBackPressed()) {
            return
        }
        super.onBackPressed()
    }
}