package com.haris.beg.omnibus.utils;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;

/**
 * Created by haris on 12/31/2015.
 */
public class MyAnimationManager {
    private static MyAnimationManager ourInstance = new MyAnimationManager();

    public static MyAnimationManager getInstance() {
        return ourInstance;
    }

    private MyAnimationManager() {
    }

    public void animateButton(Button button) {
        Animation animation = new AlphaAnimation(1.0f, 0.0f);
        animation.setDuration(250);//milliseconds
        button.startAnimation(animation);
    }
}
