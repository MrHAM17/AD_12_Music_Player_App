package com.example.musicplayer;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

import androidx.annotation.Nullable;

public class MyCustomService extends Service {

    // Note: In mAndroidManifest.xml file --> add this class (which is used as a service)

    // To Play music, we need a media player object
    private MediaPlayer player;


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // this will play the audio of default ringtone in the device
        player = MediaPlayer.create(
                this,
                Settings.System.DEFAULT_RINGTONE_URI
        );

        // play the ringtone audio on loop (continuously)
        player.setLooping(true);

        player.start();

        return START_STICKY;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();

        player.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
