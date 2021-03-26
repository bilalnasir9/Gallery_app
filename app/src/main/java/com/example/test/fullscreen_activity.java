package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class fullscreen_activity extends AppCompatActivity {
ImageView imageViewFULLscrn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        imageViewFULLscrn=findViewById(R.id.imageVw_fulllscrn);
        Intent intent = getIntent();
       int position= intent.getIntExtra("position",1);
        imageViewFULLscrn.setImageResource(position);

    }
}