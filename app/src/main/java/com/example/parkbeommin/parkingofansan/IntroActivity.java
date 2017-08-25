package com.example.parkbeommin.parkingofansan;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class IntroActivity extends AppCompatActivity {
    Animation ani_P, ani_alpha, ani_A, ani_car;
    TextView t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14;
ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        ani_P = AnimationUtils.loadAnimation(this, R.anim.translate);
        ani_alpha = AnimationUtils.loadAnimation(this, R.anim.alpha);ani_A = AnimationUtils.loadAnimation(this, R.anim.translate2);
        ani_car = AnimationUtils.loadAnimation(this, R.anim.translate3);
        t1 = (TextView) findViewById(R.id.start_P);
        t2 = (TextView) findViewById(R.id.start_A);
        t3 = (TextView) findViewById(R.id.start_R);
        t4 = (TextView) findViewById(R.id.start_K);
        t5 = (TextView) findViewById(R.id.start_I);
        t6 = (TextView) findViewById(R.id.start_N);
        t7 = (TextView) findViewById(R.id.start_G);
        t8 = (TextView) findViewById(R.id.start_O);
        t9 = (TextView) findViewById(R.id.start_F);
        t10 = (TextView) findViewById(R.id.start_A2);
        t11 = (TextView) findViewById(R.id.start_N2);
        t12 = (TextView) findViewById(R.id.start_S);
        t13 = (TextView) findViewById(R.id.start_A3);
        t14 = (TextView) findViewById(R.id.start_N3);
        i1 = (ImageView) findViewById(R.id.car);
        t1.startAnimation(ani_P);
        t2.startAnimation(ani_alpha);
        t3.startAnimation(ani_alpha);
        t4.startAnimation(ani_alpha);
        t5.startAnimation(ani_alpha);
        t6.startAnimation(ani_alpha);
        t7.startAnimation(ani_alpha);
        t9.startAnimation(ani_alpha);
        t10.startAnimation(ani_A);
        t11.startAnimation(ani_alpha);
        t12.startAnimation(ani_alpha);
        t13.startAnimation(ani_alpha);
        t14.startAnimation(ani_alpha);
        i1.startAnimation(ani_car);

                Handler handler = new Handler() {
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                Intent intent = new Intent(IntroActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        handler.sendEmptyMessageDelayed(0, 3000);

    }
}
