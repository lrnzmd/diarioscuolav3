package com.example.diarioscuola.lezioni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diarioscuola.R

class Lezioni : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lezioni_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LezioniFragment.newInstance())
                .commitNow()
        }
    }

}
