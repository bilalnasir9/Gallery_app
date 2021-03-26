package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewTEST;
    public int[] imagearray;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayfil();
        recyclerViewTEST = findViewById(R.id.recyclerTEST);
        recyclerViewTEST.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerViewTEST.setHasFixedSize(true);
        recyclerViewTEST.setItemViewCacheSize(20);
        recyclerViewTEST.setDrawingCacheEnabled(true);
        recyclerViewTEST.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        recyclerViewTEST.setNestedScrollingEnabled(false);
        adapter_class objadapter = new adapter_class(this, imagearray);
        recyclerViewTEST.setAdapter(objadapter);
    }

    public void arrayfil() {
        imagearray = new int[]{
                R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.four,
                R.drawable.five,
                R.drawable.six,
                R.drawable.seven,
                R.drawable.eight,
                R.drawable.nine,
                R.drawable.ten,
                R.drawable.eleven,
                R.drawable.tweleve,
                R.drawable.thirteen,
                R.drawable.fourteen,
                R.drawable.fifteen,
                R.drawable.sixteen,
                R.drawable.seventeen,
                R.drawable.eighteen,
                R.drawable.nineteen,
                R.drawable.twenty,
                R.drawable.twentyone,
                R.drawable.twentytwo,
                R.drawable.twentythree,
                R.drawable.twentyfour,
                R.drawable.twentyfive,
                R.drawable.twentysix,
                R.drawable.twentyseven,
                R.drawable.twentyeight,
                R.drawable.twentynine,
                R.drawable.thirty,
        };
    }
}