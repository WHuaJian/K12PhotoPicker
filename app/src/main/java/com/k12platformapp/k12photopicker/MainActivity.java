package com.k12platformapp.k12photopicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import cn.k12cloud.k12photopicker.PhotoPickerUtils;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOpen_photo = findViewById(R.id.btnOpen_photo);
        btnOpen_photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PhotoPickerUtils.startPhotoPickerActivity(MainActivity.this,10,100);
            }
        });
        Button btnOpen_video = findViewById(R.id.btnOpen_video);
        btnOpen_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PhotoPickerUtils.startVideoPickerActivity(MainActivity.this,10,100);
            }
        });
    }
}
