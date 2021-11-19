package com.techos.nombreridiculoporfayaenserio

import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentActivity

/**
 * Loads [MainFragment].
 */
class MainActivity : FragmentActivity() {

    lateinit var tv : TextView
    lateinit var text : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                .commitNow()
        }
        tv = findViewById(R.id.textView2)
    }

    fun cambieamePrro(view: android.view.View) {
        tv.text = "PANDA"
    }
}