package com.gdandroidbolivia.babymater11;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class AnimalesActivity extends AppCompatActivity {
    private MediaPlayer mpa;
    private MediaPlayer mpas1, mpas2, mpas3, mpas4, mpas5, mpas6;
    private ImageView mal;
    private ImageView bien;
    private Button play;
    int pos = 0;
    int pos1 = 0;
    int pos2 = 0;
    int pos3 = 0;
    int pos4 = 0;
    int pos5 = 0;

    int sw = 1;
    int sw1 = 1;
    int sw2 = 1;
    int sw3 = 1;
    int sw4 = 1;
    int sw5 = 1;

    private ImageView imagen1;
    private ImageView imagen2;
    private ImageView imagen3;
    private Animation animacion, animatione;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);

        imagen1 = (ImageView) findViewById(R.id.idImagen1);
        imagen2 = (ImageView) findViewById(R.id.idImagen2);
        imagen3 = (ImageView) findViewById(R.id.idImagen3);
        mpas1 = MediaPlayer.create(this, R.raw.oveja);
        mpas2=MediaPlayer.create(this,R.raw.caballo);
        mpas3=MediaPlayer.create(this,R.raw.vaca);
        mpas4=MediaPlayer.create(this,R.raw.burro);
        mpas5=MediaPlayer.create(this,R.raw.cerdo);
        mpas6=MediaPlayer.create(this,R.raw.gallo);

        findViewById(R.id.ant).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpas1.stop();
                mpas2.stop();
                mpas3.stop();
                mpas4.stop();
                mpas5.stop();
                mpas6.stop();
                AnimalesActivity.this.startActivity(new Intent(AnimalesActivity.this, MainActivity.class));

            }
        });

    }
    public void oveja(View v) {
        if (mpas2.isPlaying()){
            mpas2.stop();
        }
        if(mpas3.isPlaying()) {
            mpas3.stop();
        }
        if(mpas4.isPlaying())
        {
            mpas4.stop();
        }
        if(mpas5.isPlaying())
        {
            mpas5.stop();
        }
        if(mpas6.isPlaying())
        {
            mpas6.stop();

        }
        if(mpas1.isPlaying())
        {
            mpas1.stop();
        }


         mpas1.start();

}





        /*animacion= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
        imagen2.startAnimation(animacion);
        Toast.makeText(getApplicationContext(),"MUY BIEN HECHO :-)",Toast.LENGTH_LONG).show();
        animatione= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        imagen3.startAnimation(animatione);
        mpa5.stop();*/

    public void caballo(View v) {
        if (mpas1.isPlaying()){
            mpas1.stop();
        }
        if(mpas3.isPlaying()) {
            mpas3.stop();
        }
        if(mpas4.isPlaying())
        {
            mpas4.stop();
        }
        if(mpas5.isPlaying())
        {
            mpas5.stop();
        }
        if(mpas6.isPlaying())
        {
            mpas6.stop();
        }

        mpas2.start();
    }
    public void vaca(View v) {
        if (mpas2.isPlaying()){
            mpas2.stop();
        }
        if(mpas1.isPlaying()) {
            mpas1.stop();
        }
        if(mpas4.isPlaying())
        {
            mpas4.stop();
        }
        if(mpas5.isPlaying())
        {
            mpas5.stop();
        }
        if(mpas6.isPlaying())
        {
            mpas6.stop();
        }

        mpas3.start();
    }
    public void burro(View v) {
        if (mpas2.isPlaying()){
            mpas2.stop();
        }
        if(mpas3.isPlaying()) {
            mpas3.stop();
        }
        if(mpas1.isPlaying())
        {
            mpas1.stop();
        }
        if(mpas5.isPlaying())
        {
            mpas5.stop();
        }
        if(mpas6.isPlaying())
        {
            mpas6.stop();
        }


        mpas4.start();


    }
    public void cerdo(View v) {

        if (mpas2.isPlaying()){
            mpas2.stop();
        }
        if(mpas3.isPlaying()) {
            mpas3.stop();
        }
        if(mpas4.isPlaying())
        {
            mpas4.stop();
        }
        if(mpas1.isPlaying())
        {
            mpas1.stop();
        }
        if(mpas6.isPlaying())
        {
            mpas6.stop();
        }

        mpas5.start();
        }
    public void gallo(View v) {



        if (mpas2.isPlaying()){
            mpas2.stop();
        }
        if(mpas3.isPlaying()) {
            mpas3.stop();
        }
        if(mpas4.isPlaying())
        {
            mpas4.stop();
        }
        if(mpas5.isPlaying())
        {
            mpas5.stop();
        }
        if(mpas1.isPlaying())
        {
            mpas1.stop();
        }

        mpas6.start();
    }}




