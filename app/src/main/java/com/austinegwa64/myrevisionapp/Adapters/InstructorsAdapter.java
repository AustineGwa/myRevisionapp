package com.austinegwa64.myrevisionapp.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.austinegwa64.myrevisionapp.Models.Instructor;
import com.austinegwa64.myrevisionapp.R;

import java.util.ArrayList;

/**
 * Created by gwaza on 3/22/2018.
 */

public class InstructorsAdapter extends RecyclerView.Adapter<InstructorsAdapter.InstructorsViewHolder>{

   ArrayList <Instructor> allVideos;
   static ItemClickListener itemClickListener;

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }


    public InstructorsAdapter(ArrayList<Instructor> allVideos, ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
        this.allVideos = allVideos;
    }

    @Override
    public  InstructorsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View videoLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.instructor_single_row, parent, false);

        InstructorsViewHolder videos_View_Holder = new InstructorsViewHolder(videoLayout);
        return videos_View_Holder;
    }


    @Override
    public void onBindViewHolder(InstructorsViewHolder  holder, int position) {

        Instructor instructor = allVideos.get(position);

        holder.instructorImage.setImageResource(instructor.getImage());
        holder.instructorName.setText(instructor.getName());
        holder.instructorDescription.setText(instructor.getDescription());

    }


    @Override
    public int getItemCount() {
        return allVideos.size();
    }

    public static class InstructorsViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener {

       ImageView instructorImage;
       TextView  instructorName, instructorDescription;
       Context context;

        public InstructorsViewHolder(View itemView) {
            super(itemView);

            instructorImage = itemView.findViewById(R.id.instructorImage);
            instructorName =  itemView.findViewById(R.id.instructor_name);
            instructorDescription = itemView.findViewById(R.id.instructor_desc);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            int clickedPosition = getAdapterPosition();
            itemClickListener.onItemClick(view ,clickedPosition);
        }
    }
}
