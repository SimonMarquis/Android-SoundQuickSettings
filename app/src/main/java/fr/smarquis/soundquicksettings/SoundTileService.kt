package fr.smarquis.soundquicksettings

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.media.AudioManager
import android.media.AudioManager.ADJUST_SAME
import android.media.AudioManager.FLAG_SHOW_UI
import android.service.quicksettings.TileService

class SoundTileService : TileService() {
    override fun onClick() {
        getSystemService(AudioManager::class.java).adjustVolume(ADJUST_SAME, FLAG_SHOW_UI)
        Intent(this, EmptyActivity::class.java).apply {
            addFlags(FLAG_ACTIVITY_NEW_TASK)
        }.let(::startActivityAndCollapse)
    }
}
