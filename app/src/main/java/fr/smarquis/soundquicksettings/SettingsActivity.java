package fr.smarquis.soundquicksettings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import static android.provider.Settings.ACTION_SOUND_SETTINGS;

public class SettingsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(ACTION_SOUND_SETTINGS));
        finish();
    }
}
