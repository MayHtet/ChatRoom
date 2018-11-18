package com.example.mizuki.chatroomapplication.data.model;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import com.example.mizuki.chatroomapplication.data.vos.ChatRoom;

import com.example.mizuki.chatroomapplication.delegate.ChatListCallBack;
import com.example.mizuki.chatroomapplication.utils.NetworkConstant;


import com.example.mizuki.chatroomapplication.delegate.ChatListCallBack;
import com.example.mizuki.chatroomapplication.utils.NetworkConstant;

import com.example.mizuki.chatroomapplication.delegate.ChatListCallBack;
import com.example.mizuki.chatroomapplication.utils.NetworkConstant;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Date;

public class AppModel extends AndroidViewModel {
    public AppModel(@NonNull Application application) {
        super(application);
    }
    public void startLoadingChatList(final ChatListCallBack chatListCallBack){
        DatabaseReference chatDBR = FirebaseDatabase.getInstance().getReference();
        DatabaseReference chatChildDBR = chatDBR.child(NetworkConstant.CHAT_MESSAGE);
        chatChildDBR.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                ArrayList<ChatRoom> chatArrayList = new ArrayList<>();
                for (DataSnapshot chatDSS:dataSnapshot.getChildren()
                     ) {
                    ChatRoom chatRoom = chatDSS.getValue(ChatRoom.class);
                    chatArrayList.add(chatRoom);

                }
                chatListCallBack.loadChatList(chatArrayList);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
    public void startUploadChatMessage(ChatRoom chatRoom){
        DatabaseReference chatDBR = FirebaseDatabase.getInstance().getReference();
        DatabaseReference chatChildDBR  = chatDBR.child(NetworkConstant.CHAT_MESSAGE);
        chatChildDBR.child(String.valueOf(new Date().getTime())).setValue(chatRoom);
    }



}
