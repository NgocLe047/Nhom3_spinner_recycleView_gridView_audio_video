package com.playingaudio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
    public void play(View view){
        if (mediaPlayer ==null) {
            mediaPlayer = MediaPlayer.create(this, R.raw.nightglow);
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    restartPlayer();
                }
            });
        }
        mediaPlayer.start();
    }
    public void pause (View view){
        if (mediaPlayer!=null) {
            mediaPlayer.pause();
        }
    }
    public void restart (View view) {
        restartPlayer();
    }
    private void restartPlayer() {
        if (mediaPlayer !=null) {
            mediaPlayer.release();
            mediaPlayer= null;
            Toast.makeText(this, "MediaPlayer Restarted", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        restartPlayer();
    }
}