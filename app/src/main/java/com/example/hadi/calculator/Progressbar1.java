package com.example.hadi.calculator;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;

/**
 * Created by hadi on 09/10/2016.
 */
public class Progressbar1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progressbar);
        ProgressBar prb = (ProgressBar) findViewById(R.id.progress);
        ObjectAnimator anim = ObjectAnimator.ofInt(prb, "progress", 0, 100);
        anim.setDuration(150);
        anim.setInterpolator(new DecelerateInterpolator());
        anim.start();
        anim.end();
    }
}
