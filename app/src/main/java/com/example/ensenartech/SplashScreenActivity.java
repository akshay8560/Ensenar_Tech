package com.example.ensenartech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreenActivity extends AppCompatActivity {

    LottieAnimationView lottie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        VideoView video = (VideoView) findViewById(R.id.videoView);
        video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.vid);
        video.start();
      //  video.setOnCompletionListener((MediaPlayer.OnCompletionListener) this);

//        lottie=findViewById(R.id.animationView);
//        lottie.setSoundEffectsEnabled(true);
//        lottie.isSoundEffectsEnabled();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashScreenActivity.this,MainActivity.class);
                startActivity(i);
            }
        },1000);
    }

//    public void onCompletion(MediaPlayer mp)
//    {
//        Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
//        startActivity(intent);
//        finish();
//    }
}