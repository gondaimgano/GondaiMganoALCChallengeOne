package com.gondai.alcchallengeapp.one

import android.net.http.SslError
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.*
import kotlinx.android.synthetic.main.activity_about_alc.*

class AboutALCActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_about_alc)
        webview.apply {
            settings.apply {
                javaScriptEnabled=true
            }
            webViewClient=object:WebViewClient(){
                override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {


                    handler?.proceed()

                }

                override fun onPageFinished(view: WebView?, url: String?) {
                    super.onPageFinished(view, url)
                    progressBar.apply {
                        visibility= View.GONE
                    }
                }
                
            }
            loadUrl(context.getString(R.string.base_url)) //due to ALC certificate which expired need to place the sslerror
        }
    }

    override fun onBackPressed() {
        finish()
        super.onBackPressed()

    }
}


