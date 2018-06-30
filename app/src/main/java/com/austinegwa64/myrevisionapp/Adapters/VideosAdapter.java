package com.austinegwa64.myrevisionapp.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.austinegwa64.myrevisionapp.Models.Video;
import com.austinegwa64.myrevisionapp.R;

import java.util.ArrayList;

/**
 * Created by gwaza on 3/22/2018.
 */

public class VideosAdapter extends RecyclerView.Adapter<VideosAdapter.VideosViewHolder>{

   ArrayList <Video> allVideos;
   static ItemClickListener itemClickListener;

    public interface ItemClickListener {
        void onItemClick(View view , int position);
    }


    public VideosAdapter(ArrayList<Video> allVideos, ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
        this.allVideos = allVideos;
    }

    @Override
    public  VideosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View videoLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_single_row, parent, false);

        VideosViewHolder videos_View_Holder = new VideosViewHolder(videoLayout);
        return videos_View_Holder;
    }


    @Override
    public void onBindViewHolder(VideosViewHolder holder, int position) {

        Video video = allVideos.get(position);

        holder.videoImage.setImageResource(video.getVideoImage());
        holder.vidName.setText(video.getVideoName());
        holder.vidUrl.setText(video.getVideoUrl());


    }


    @Override
    public int getItemCount() {
        return allVideos.size();
    }

    public static class VideosViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener {

       ImageView videoImage;
       TextView  vidName, vidUrl, vidId;
       Context context;

        public VideosViewHolder(View itemView) {
            super(itemView);

            videoImage = itemView.findViewById(R.id.vid_image);
            vidName =  itemView.findViewById(R.id.vid_name);
            vidUrl = itemView.findViewById(R.id.vid_url);
            vidId  =  itemView.findViewById(R.id.vid_Id);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            int clickedPosition = getAdapterPosition();
            itemClickListener.onItemClick(view ,clickedPosition);
        }
    }
}
