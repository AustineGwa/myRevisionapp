package com.austinegwa64.myrevisionapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.austinegwa64.myrevisionapp.Adapters.InstructorsAdapter;
import com.austinegwa64.myrevisionapp.Models.Instructor;

import java.util.ArrayList;

public class Instructors extends AppCompatActivity implements InstructorsAdapter.ItemClickListener {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Instructor> signedInstructors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructors);

        int one = R.drawable.ic_person_outline_black_24dp;

        signedInstructors = new ArrayList<>();
        signedInstructors.add(new Instructor(one,"Austine Gwa", "android developer"));
        signedInstructors.add(new Instructor(one,"John Otieno", "statician"));
        signedInstructors.add(new Instructor(one,"Collins karan", "web developer"));
        signedInstructors.add(new Instructor(one,"John Pombe", "mathematician"));
        signedInstructors.add(new Instructor(one,"Olum green", "English Teacher"));

        recyclerView = findViewById(R.id.recyclerInstructors);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new InstructorsAdapter(signedInstructors, this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onItemClick(View view, int position) {
        showChat();
    }

    private void showChat() {
        Intent i = new Intent(this, Charts.class);
        startActivity(i);
    }
}
