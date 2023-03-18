package com.playingvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        String videopath = "android.resource://"+getPackageName()+"/"+R.raw.video;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);
        MediaController mediaControll = new MediaController(this);
        videoView.setMediaController(mediaControll);
        mediaControll.setAnchorView(videoView);

    }
    public void addControl(){
        videoView = findViewById(R.id.video_view);
    }
}