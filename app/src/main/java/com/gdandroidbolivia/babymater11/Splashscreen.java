package com.gdandroidbolivia.babymater11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Splashscreen extends AppCompatActivity {

     private  ImageView logo;
     private ImageButton t1;
    private ImageButton t2;
    private ImageButton t3;
    private ImageButton t4;
    private Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_splashscreen);
        logo =(ImageView) findViewById(R.id.idlogo);
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.splashcreem);
        logo.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Toast.makeText(Splashscreen.this, "VAMOS TOI TOI ADELANTE  BIENVENIDO A BABY MASTER", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent i= new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
    }
}
