package com.example.tiktokapp;

public class VideoModel {
    private String video;
    private String name;

    public VideoModel(String video, String name) {
        this.video = video;
        this.name = name;
    }

    public String getVideo() {
        return video;
    }

    public String getName() {
        return name;
    }
}
