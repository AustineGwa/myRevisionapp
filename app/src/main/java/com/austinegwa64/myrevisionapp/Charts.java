package com.austinegwa64.myrevisionapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.austinegwa64.myrevisionapp.Adapters.MessageListAdapter;
import com.austinegwa64.myrevisionapp.Models.UserMessage;

import java.util.List;

public class Charts extends AppCompatActivity {

    private RecyclerView mMessageRecycler;
    private MessageListAdapter mMessageAdapter;
    List<UserMessage> messageList = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_list);

        mMessageRecycler = (RecyclerView) findViewById(R.id.reyclerview_message_list);

        mMessageAdapter = new MessageListAdapter(this, messageList);
        mMessageRecycler.setLayoutManager(new LinearLayoutManager(this));
        mMessageRecycler.setHasFixedSize(true);
        mMessageRecycler.setAdapter(mMessageAdapter);
    }
}
