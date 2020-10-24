package fr.smarquis.soundquicksettings

import android.content.Intent
import android.content.Intent.ACTION_CLOSE_SYSTEM_DIALOGS
import android.media.AudioManager
import android.media.AudioManager.ADJUST_SAME
import android.media.AudioManager.FLAG_SHOW_UI
import android.service.quicksettings.TileService

class SoundTileService : TileService() {
    override fun onClick() {
        getSystemService(AudioManager::class.java).adjustVolume(ADJUST_SAME, FLAG_SHOW_UI)
        sendBroadcast(Intent(ACTION_CLOSE_SYSTEM_DIALOGS))
    }
}