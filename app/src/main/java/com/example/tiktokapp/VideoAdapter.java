package com.example.tiktokapp;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {
    private ArrayList<VideoModel> models;
    public VideoAdapter(ArrayList<VideoModel> models){
        this.models=models;
    }
    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        VideoModel model=models.get(position);
        holder.setData(model);
    }
    @Override
    public int getItemCount() {
        return models.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder{
        private VideoView videoView;
        private TextView textView;
        private MediaPlayer mediaPlayer;

        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            videoView=itemView.findViewById(R.id.videoview);
            textView=itemView.findViewById(R.id.txtname);
        }
        public void setData(VideoModel model){
            textView.setText(model.getName());
            videoView.setVideoPath(model.getVideo());
            videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    if (mp.isPlaying()) {
                        mp.pause();

                    } else {
                        mp.start();

                    }
                }
            });
            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    if (mp.isPlaying()) {
                        mp.pause();

                    } else {
                        mp.start();

                    }
                }
            });
        }


    }
}
