package com.example.animation.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;

import com.example.animation.R;

public class ViewAnimationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animation);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.renew,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //事件处理函数


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.renew:
                recreate();//活动重建
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.viewAlphaAnimation:
                Animation alphaAnimation= AnimationUtils.loadAnimation(this,R.anim.alpha);
                view.startAnimation(alphaAnimation);
                break;
            case R.id.viewScaleAnimation:
                Animation scaleAnimation=AnimationUtils.loadAnimation(this,R.anim.scale);
                view.startAnimation(scaleAnimation);
                break;

            case R.id.viewTranslateAnimation:
                Animation tranAnimation=AnimationUtils.loadAnimation(this,R.anim.trainlate);
                view.startAnimation(tranAnimation);
                break;

            case R.id.viewRotateAnimation:
                Animation roAnimation=AnimationUtils.loadAnimation(this,R.anim.rotate);
                view.startAnimation(roAnimation);
                break;
            case R.id.viewSetAnimation:
                Animation setAnimation=AnimationUtils.loadAnimation(this,R.anim.set);
                view.startAnimation(setAnimation);
                break;

            case R.id.viewLinear:
            case R.id.viewAccelerate:
                View viewLinear=findViewById(R.id.viewLinear);
                View viewAccerlerate=findViewById(R.id.viewAccelerate);

                Animation animationLinear=AnimationUtils.loadAnimation(this,R.anim.trainlate);
                Animation animationAccerlerate=AnimationUtils.loadAnimation(this,R.anim.trainlate);
                animationLinear.setInterpolator(new LinearInterpolator());
                animationAccerlerate.setInterpolator(new AccelerateInterpolator());

                viewLinear.startAnimation(animationLinear);
                viewAccerlerate.startAnimation(animationAccerlerate);
                break;

        }
    }
}
