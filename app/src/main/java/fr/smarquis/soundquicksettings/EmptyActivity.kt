package fr.smarquis.soundquicksettings

import android.app.Activity
import android.os.Bundle

class EmptyActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        finish()
    }
}