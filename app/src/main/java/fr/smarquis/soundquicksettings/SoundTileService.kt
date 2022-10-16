package fr.smarquis.soundquicksettings

import android.app.AlertDialog
import android.content.DialogInterface
import android.media.AudioManager
import android.media.AudioManager.ADJUST_SAME
import android.media.AudioManager.FLAG_SHOW_UI
import android.service.quicksettings.TileService
import android.view.WindowManager.LayoutParams.FLAG_DIM_BEHIND

class SoundTileService : TileService() {
    override fun onClick() {
        getSystemService(AudioManager::class.java).adjustVolume(ADJUST_SAME, FLAG_SHOW_UI)
        AlertDialog.Builder(this).create().apply {
            window?.clearFlags(FLAG_DIM_BEHIND)
            setOnShowListener(DialogInterface::dismiss)
        }.let(::showDialog)
    }
}
