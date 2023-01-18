package com.example.bottomnavigation;

import android.annotation.SuppressLint;
import android.app.PictureInPictureParams;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Rational;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class VideoPinocchio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_pinocchio);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) VideoView videoView =(VideoView)findViewById(R.id.video_pinocchio);

        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.pinocchio));
        videoView.requestFocus();
        videoView.start();
    }

    @Override
    protected void onUserLeaveHint() {
        PictureInPictureParams pictureInPictureParams = null;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            pictureInPictureParams = new  PictureInPictureParams.Builder()
                    .setAspectRatio(new Rational(2, 1))
                    .build();
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            enterPictureInPictureMode(pictureInPictureParams);
        }
        super.onUserLeaveHint();
    }
    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        if (isInPictureInPictureMode) {
            getSupportActionBar().hide();
        } else {
            getSupportActionBar().show();
        }
    }
}