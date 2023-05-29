package com.shariar.bkashdemo.util

import android.content.Context
import android.content.Intent
import android.webkit.JavascriptInterface
import com.shariar.bkashdemo.features.bkash.MainActivity

class JSInterface(var context: Context) {

    @JavascriptInterface
    fun switchActivity() {
        val intent = Intent(context, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        context.startActivity(intent)
    }
}