package com.gdandroidbolivia.babymater11;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VocalesActivity extends AppCompatActivity {
    MediaPlayer mp1;
    MediaPlayer mpa1,mpa2,mpa3,mpa4,mpa5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocales);
        mpa1=MediaPlayer.create(this,R.raw.vocala);
        mpa2=MediaPlayer.create(this,R.raw.vocale);
        mpa3=MediaPlayer.create(this,R.raw.vocali);
        mpa4=MediaPlayer.create(this,R.raw.vocalo);
        mpa5=MediaPlayer.create(this,R.raw.vocalu);

        findViewById(R.id.ant).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpa1.stop();
                mpa2.stop();
                mpa3.stop();
                mpa4.stop();
                mpa5.stop();

                VocalesActivity.this.startActivity(new Intent(VocalesActivity.this,MainActivity.class));

            }
        });
    }
    public void a(View v) {

        mpa1.start();
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

        /*animacion= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        imagen2.startAnimation(animacion);
        Toast.makeText(getApplicationContext(),"MUY BIEN HECHO :-)",Toast.LENGTH_LONG).show();
        animatione= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        imagen3.startAnimation(animatione);
        mpa5.stop();*/
    }
    public void e(View v) {

        mpa2.start();
        if (mpa1.isPlaying()){
            mpa1.stop();
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
    public void i(View v) {

        mpa3.start();
        if (mpa2.isPlaying()){
            mpa2.stop();
        }
        if(mpa1.isPlaying()) {
            mpa1.stop();
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
    public void o(View v) {

        mpa4.start();
        if (mpa2.isPlaying()){
            mpa2.stop();
        }
        if(mpa3.isPlaying()) {
            mpa3.stop();
        }
        if(mpa1.isPlaying())
        {
            mpa1.stop();
        }
        if(mpa5.isPlaying())
        {
            mpa5.stop();
        }
    }
    public void u(View v) {

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
        if(mpa1.isPlaying())
        {
            mpa1.stop();
        }

    }
}
