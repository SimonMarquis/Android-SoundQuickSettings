package fr.smarquis.soundquicksettings

import android.app.Activity
import android.content.Intent
import android.os.Build.VERSION.SDK_INT
import android.os.Build.VERSION_CODES.Q
import android.os.Bundle
import android.provider.Settings.ACTION_SOUND_SETTINGS
import android.provider.Settings.Panel.ACTION_VOLUME

class SettingsActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(
                if (SDK_INT >= Q) ACTION_VOLUME
                else ACTION_SOUND_SETTINGS
        ))
        finish()
    }
}