package com.hjq.localmaven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hjq.libapp.LibView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(LibView(this))
    }
}