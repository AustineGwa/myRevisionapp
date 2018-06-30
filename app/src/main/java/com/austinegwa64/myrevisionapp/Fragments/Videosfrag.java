package com.austinegwa64.myrevisionapp.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.austinegwa64.myrevisionapp.Adapters.VideosAdapter;
import com.austinegwa64.myrevisionapp.Models.Video;
import com.austinegwa64.myrevisionapp.R;
import com.austinegwa64.myrevisionapp.VideoTv2;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Videosfrag extends Fragment implements VideosAdapter.ItemClickListener {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Video> loadedVideos;
    public Videosfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView =  inflater.inflate(R.layout.fragment_videosfrag, container, false);

        loadedVideos = new ArrayList<>();
        loadedVideos.add(new Video(1,"Introducing Android", "https://www.youtube.com/watch?v=Z98hXV9GmzY", R.drawable.android));
        loadedVideos.add(new Video(2,"Kotlin programming", "https://www.youtube.com/watch?v=9JpNY-XAseg", R.drawable.kotlin));
        loadedVideos.add(new Video(1,"c++ vs Java", "url", R.drawable.comparison));
        loadedVideos.add(new Video(1,"Java Inheritance", "https://www.youtube.com/watch?v=9JpNY-XAseg", R.drawable.inheritance));
        loadedVideos.add(new Video(1,"Android Storage", "url", R.drawable.storage));

        recyclerView = myView.findViewById(R.id.vidos_recyclerview);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        adapter = new VideosAdapter(loadedVideos,  this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        return  myView;
    }


    @Override
    public void onItemClick(View view, int position) {

        showVideo();

    }

    private void showVideo() {

        String vidUrl = "https://www.youtube.com/watch?v=9JpNY-XAseg";

        Intent i = new Intent(getActivity(), VideoTv2.class );
        startActivity(i);
    }


}
