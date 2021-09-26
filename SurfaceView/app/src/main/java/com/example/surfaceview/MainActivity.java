package com.example.surfaceview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CustomSurfaceView view = new CustomSurfaceView(getBaseContext());
        setContentView(view);
    }
}