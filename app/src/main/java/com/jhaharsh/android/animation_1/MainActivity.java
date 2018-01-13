package com.jhaharsh.android.animation_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.jhaharsh.android.animation_1.R.id.sin;

public class MainActivity extends AppCompatActivity {

    class Animation{

        void Rotate(){
            ImageView sin = (ImageView) findViewById(R.id.sin);
            sin.animate()
                    .rotation(-1080f)
                    .scaleX(1f)
                    .scaleY(1f)
                    .setDuration(2000);
        }
    }

    public void shade (View view){

        /*ImageView sin = (ImageView) findViewById(R.id.sin);
        sin.animate().translationXBy(2000f).setDuration(1000);
        sin.animate().rotation(1080f).setDuration(2000);
        ImageView tom = (ImageView) findViewById(R.id.tom);
        tom.animate().rotation(360f).setDuration(1000);
        tom.animate().alpha(0f).setDuration(1000);*/

        /*ImageView sin = (ImageView) findViewById(R.id.sin);
        sin.animate()
                .rotation(-1080f)
                .scaleX(1f)
                .scaleY(1f)
                .setDuration(2000);*/
        Animation obj = new Animation();
        obj.Rotate();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*ImageView sin = (ImageView) findViewById(R.id.sin);
        sin.setTranslationX(-2000f);*/

        ImageView sin = (ImageView) findViewById(R.id.sin);
        sin.animate().rotation(1080f).scaleX(.5f).scaleY(.5f).setDuration(2000);
    }
}
