package com.gdandroidbolivia.babymater11;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class NumerosActivity extends AppCompatActivity {
   MediaPlayer mpas;
    MediaPlayer mpa1,mpa2,mpa3,mpa4,mpa5,mpa6,mpa7,mpa8,mpa9;
    private Animation animacion,animatione;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros);
        mpa1=MediaPlayer.create(this,R.raw.numero1);
        mpa2=MediaPlayer.create(this,R.raw.numero2);
        mpa3=MediaPlayer.create(this,R.raw.numero3);
        mpa4=MediaPlayer.create(this,R.raw.numero4);
        mpa5=MediaPlayer.create(this,R.raw.numero5);
        mpa6=MediaPlayer.create(this,R.raw.numero6);
        mpa7=MediaPlayer.create(this,R.raw.numero7);
        mpa8=MediaPlayer.create(this,R.raw.numero8);
        mpa9=MediaPlayer.create(this,R.raw.numero9);

        findViewById(R.id.ant).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpa1.stop();
                mpa2.stop();
                mpa3.stop();
                mpa4.stop();
                mpa5.stop();
                mpa6.stop();
                mpa7.stop();
                mpa8.stop();
                mpa9.stop();

                NumerosActivity.this.startActivity(new Intent(NumerosActivity.this,MainActivity.class));
            }
        });
    }
    public void uno(View v) {


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
        if(mpa7.isPlaying())
        {
            mpa7.stop();
        }
        if(mpa8.isPlaying())
        {
            mpa8.stop();
        }
        if(mpa9.isPlaying())
        {
            mpa9.stop();
        }
        /*animacion= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        imagen2.startAnimation(animacion);
        Toast.makeText(getApplicationContext(),"MUY BIEN HECHO :-)",Toast.LENGTH_LONG).show();
        animatione= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        imagen3.startAnimation(animatione);
        mpa5.stop();*/
    }
    public void dos(View v) {

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
        if(mpa7.isPlaying())
        {
            mpa7.stop();
        }
        if(mpa8.isPlaying())
        {
            mpa8.stop();
        }
        if(mpa9.isPlaying())
        {
            mpa9.stop();
        }


    }
    public void tres(View v) {

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
        if(mpa7.isPlaying())
        {
            mpa7.stop();
        }
        if(mpa8.isPlaying())
        {
            mpa8.stop();
        }
        if(mpa9.isPlaying())
        {
            mpa9.stop();
        }

    }
    public void cuatro(View v) {


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
        if(mpa7.isPlaying())
        {
            mpa7.stop();
        }
        if(mpa8.isPlaying())
        {
            mpa8.stop();
        }
        if(mpa9.isPlaying())
        {
            mpa9.stop();
        }

    }
    public void cinco(View v) {

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
        if(mpa7.isPlaying())
        {
            mpa7.stop();
        }
        if(mpa8.isPlaying())
        {
            mpa8.stop();
        }
        if(mpa9.isPlaying())
        {
            mpa9.stop();
        }


    }
    public void seis(View v) {


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
        if(mpa7.isPlaying())
        {
            mpa7.stop();
        }
        if(mpa8.isPlaying())
        {
            mpa8.stop();
        }
        if(mpa9.isPlaying())
        {
            mpa9.stop();
        }
    }
    public void siete(View v) {

        mpa7.start();
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
        if(mpa1.isPlaying())
        {
            mpa1.stop();
        }
        if(mpa8.isPlaying())
        {
            mpa8.stop();
        }
        if(mpa9.isPlaying())
        {
            mpa9.stop();
        }
    }
    public void ocho(View v) {

        mpa8.start();
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
        if(mpa7.isPlaying())
        {
            mpa7.stop();
        }
        if(mpa1.isPlaying())
        {
            mpa1.stop();
        }
        if(mpa9.isPlaying())
        {
            mpa9.stop();
        }
    }
    public void nueve(View v) {

        mpa9.start();
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
        if(mpa7.isPlaying())
        {
            mpa7.stop();
        }
        if(mpa8.isPlaying())
        {
            mpa8.stop();
        }
        if(mpa1.isPlaying())
        {
            mpa1.stop();
        }
    }
}
