package com.example.tiktokapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private ArrayList<VideoModel> modelList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        viewPager2=findViewById(R.id.viewpager2);
        buildData();
        setAdapter();

    }
    private void setAdapter() {
        VideoAdapter adapter=new VideoAdapter(modelList);
        viewPager2.setAdapter(adapter);
    }

    private void buildData() {
        modelList.add(new VideoModel("https://cdn.videvo.net/videvo_files/video/free/2019-02/small_watermarked/181004_10_LABORATORIES-SCIENCE_22_preview.webm","Motivation"));
        modelList.add(new VideoModel("https://images.all-free-download.com/footage_preview/webm/horses_101.webm","SOng"));
        modelList.add(new VideoModel("https://cdn.videvo.net/videvo_files/video/free/2019-02/small_watermarked/181004_10_LABORATORIES-SCIENCE_22_preview.webm","Motivation"));
        modelList.add(new VideoModel("https://images.all-free-download.com/footage_preview/webm/horses_101.webm","SOng"));
    }
}