package com.gdandroidbolivia.babymater11;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SentidosActivity extends AppCompatActivity {
  MediaPlayer Mp;
    MediaPlayer mpa2,mpa3,mpa4,mpa5,mpa6,mpa7,mpa8,mpa9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentidos);
        mpa2=MediaPlayer.create(this,R.raw.elgusto);
        mpa3=MediaPlayer.create(this,R.raw.lanariz);
        mpa4=MediaPlayer.create(this,R.raw.lavista);
        mpa5=MediaPlayer.create(this,R.raw.eltacto);
        mpa6=MediaPlayer.create(this,R.raw.eloido);

        findViewById(R.id.ant).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mpa2.stop();
                mpa3.stop();
                mpa4.stop();
                mpa5.stop();
                mpa6.stop();
                SentidosActivity.this.startActivity(new Intent(SentidosActivity.this,MainActivity.class));

            }
        });
    }
    public void gusto(View v) {

        mpa2.start();

        if(mpa3.isPlaying()) {
            mpa3.stop();
        }
        if(mpa4.isPlaying())
        {
            mpa4.stop();
        }
        if(mpa5.isPlaying())
        {
            mpa5.stop();
        }
        if(mpa6.isPlaying())
        {
            mpa6.stop();
        }
            }
    public void olfato(View v) {

        mpa3.start();
        if (mpa2.isPlaying()){
            mpa2.stop();
        }

        if(mpa4.isPlaying())
        {
            mpa4.stop();
        }
        if(mpa5.isPlaying())
        {
            mpa5.stop();
        }
        if(mpa6.isPlaying())
        {
            mpa6.stop();
        }

    }
    public void vista(View v) {


        mpa4.start();
        if (mpa2.isPlaying()){
            mpa2.stop();
        }
        if(mpa3.isPlaying()) {
            mpa3.stop();
        }

        if(mpa5.isPlaying())
        {
            mpa5.stop();
        }
        if(mpa6.isPlaying())
        {
            mpa6.stop();
        }

    }
    public void tacto(View v) {


        mpa5.start();
        if (mpa2.isPlaying()){
            mpa2.stop();
        }
        if(mpa3.isPlaying()) {
            mpa3.stop();
        }
        if(mpa4.isPlaying())
        {
            mpa4.stop();
        }

        if(mpa6.isPlaying())
        {
            mpa6.stop();
        }


    }
    public void oido(View v) {


        mpa6.start();
        if (mpa2.isPlaying()){
            mpa2.stop();
        }
        if(mpa3.isPlaying()) {
            mpa3.stop();
        }
        if(mpa4.isPlaying())
        {
            mpa4.stop();
        }
        if(mpa5.isPlaying())
        {
            mpa5.stop();
        }

    }
}
