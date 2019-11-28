package com.example.diarioscuola.appunti

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diarioscuola.R

class appunti : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.appunti_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, AppuntiFragment.newInstance())
                .commitNow()
        }
    }

}
