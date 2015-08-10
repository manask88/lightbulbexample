package com.example.manuel.lightbulb;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    private final String TAG = getClass().getSimpleName();
    private ImageView lightBulbImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lightBulbImageView = (ImageView) findViewById(R.id.lightBulbImageView);


    }


    private void hideLightBulb(){
        lightBulbImageView.setVisibility(View.INVISIBLE);
    }

    private void showLightBulb(){
        lightBulbImageView.setVisibility(View.VISIBLE);
    }

    private void turnYellow(){
        lightBulbImageView.setImageResource(R.drawable.yellow);
        lightBulbImageView.setVisibility(View.VISIBLE);
    }

    private void turnBlue(){
        lightBulbImageView.setImageResource(R.drawable.blue);
        lightBulbImageView.setVisibility(View.VISIBLE);
    }

    private void turnPink(){
        lightBulbImageView.setImageResource(R.drawable.pink);
        lightBulbImageView.setVisibility(View.VISIBLE);
    }





}
