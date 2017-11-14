package com.gdandroidbolivia.babymater11;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ColoresActivity extends AppCompatActivity {
    MediaPlayer mpan;
    private MediaPlayer anim,mpa1,mpa2,mpa3,mpa4,mpa5,mpa6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);
        mpa1=MediaPlayer.create(this,R.raw.cafe);
        mpa2=MediaPlayer.create(this,R.raw.rojo);
        mpa3=MediaPlayer.create(this,R.raw.amarillo);
        mpa4=MediaPlayer.create(this,R.raw.celeste);
        mpa5=MediaPlayer.create(this,R.raw.naranja);
        mpa6=MediaPlayer.create(this,R.raw.verde);

        findViewById(R.id.ant).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpa1.stop();
                mpa2.stop();
                mpa3.stop();
                mpa4.stop();
                mpa5.stop();
                mpa6.stop();
                ColoresActivity.this.startActivity(new Intent(ColoresActivity.this,MainActivity.class));

            }
        });
    }
    public void cafe(View v) {

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
        if(mpa6.isPlaying())
        {
            mpa6.stop();
        }
        /*animacion= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        imagen2.startAnimation(animacion);
        Toast.makeText(getApplicationContext(),"MUY BIEN HECHO :-)",Toast.LENGTH_LONG).show();
        animatione= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        imagen3.startAnimation(animatione);
        mpa5.stop();*/
    }
    public void rojo(View v) {

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
        if(mpa6.isPlaying())
        {
            mpa6.stop();
        }



    }
    public void amarillo(View v) {

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
        if(mpa6.isPlaying())
        {
            mpa6.stop();
        }


    }
    public void celeste(View v) {


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
        if(mpa6.isPlaying())
        {
            mpa6.stop();
        }
    }
    public void naranja(View v) {

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
        if(mpa6.isPlaying())
        {
            mpa6.stop();
        }

    }
    public void verde(View v) {

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
        if(mpa1.isPlaying())
        {
            mpa1.stop();
        }
}}
