package com.shariar.bkashdemo.features.bkash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import com.shariar.bkashdemo.R
import org.jetbrains.anko.sdk27.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        btn_pay_with_bkash.onClick {
            val amount = editTextAmount.text.toString()
            val intent = Intent(this@MainActivity, BkashPaymentActivity::class.java)
            intent.putExtra("amount", amount)
            //intent.putExtra("intent", "sale") //if you require Immediate transfer
            intent.putExtra("intent", "authorization") // if you require Auth & Capture
            startActivity(intent)
        }
    }
}
