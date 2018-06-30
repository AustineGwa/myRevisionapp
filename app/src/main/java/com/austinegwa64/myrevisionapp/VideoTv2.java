package com.austinegwa64.myrevisionapp;

import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoTv2 extends AppCompatActivity {

    VideoView myVideos;
    ProgressDialog progressDialog;
    String videoUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_tv2);

        myVideos =  findViewById(R.id.full_screen_video_content);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("loading...");
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();



       // videoUrl = getIntent().getStringExtra("vidUrl");

        videoUrl = "https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";

        MediaController vidControl = new MediaController(this);
        vidControl.setAnchorView(myVideos);
        myVideos.setMediaController(vidControl);

        Uri uri = Uri.parse(videoUrl);
        myVideos.setVideoURI(uri);
        myVideos.requestFocus();
        myVideos.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                progressDialog.dismiss();
                mediaPlayer.setLooping(true);
                myVideos.start();
            }
        });

    }

}
