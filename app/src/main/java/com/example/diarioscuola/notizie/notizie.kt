package com.example.diarioscuola.notizie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diarioscuola.notizie.ui.notizie.NotizieFragment

class notizie : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.notizie_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, NotizieFragment.newInstance())
                .commitNow()
        }
    }

}
