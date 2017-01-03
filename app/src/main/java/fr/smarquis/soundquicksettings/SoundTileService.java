package fr.smarquis.soundquicksettings;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Build;
import android.service.quicksettings.TileService;

import static android.media.AudioManager.ADJUST_SAME;
import static android.media.AudioManager.FLAG_SHOW_UI;

@TargetApi(Build.VERSION_CODES.N)
public class SoundTileService extends TileService {

    @Override
    public void onClick() {
        super.onClick();
        ((AudioManager) getSystemService(Context.AUDIO_SERVICE)).adjustVolume(ADJUST_SAME, FLAG_SHOW_UI);
        sendBroadcast(new Intent(Intent.ACTION_CLOSE_SYSTEM_DIALOGS));
    }
}
