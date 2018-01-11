package com.nastysloper.imageviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TurtleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turtle);
    }

    public void radioClick(View view) {
        ImageView img = (ImageView) findViewById(R.id.turtle_image);
        int id = view.getId();
        if (id == R.id.leo_button) {
            img.setImageResource(R.drawable.ninja_turtles1);
        } else if (id == R.id.raph_button) {
            img.setImageResource(R.drawable.ninja_turtles2);
        } else if (id == R.id.mike_button) {
            img.setImageResource(R.drawable.ninja_turtles3);
        } else if (id == R.id.don_button) {
            img.setImageResource(R.drawable.ninja_turtles4);
        }
    }
}
