package com.example.mizuki.chatroomapplication.data.model;
import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;
import android.util.Log;
import com.example.mizuki.chatroomapplication.data.vos.ChatRoom;
<<<<<<< HEAD
import com.example.mizuki.chatroomapplication.delegate.ChatListCallBack;
import com.example.mizuki.chatroomapplication.utils.NetworkConstant;
=======

import com.example.mizuki.chatroomapplication.delegate.ChatListCallBack;
import com.example.mizuki.chatroomapplication.utils.NetworkConstant;

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
import com.example.mizuki.chatroomapplication.delegate.ChatListCallBack;
import com.example.mizuki.chatroomapplication.utils.NetworkConstant;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import com.example.mizuki.chatroomapplication.delegate.ChatListCallBack;
import com.example.mizuki.chatroomapplication.utils.NetworkConstant;
import com.example.mizuki.chatroomapplication.delegate.ChatListCallBack;
import com.example.mizuki.chatroomapplication.utils.NetworkConstant;
import com.example.mizuki.chatroomapplication.delegate.ChatListCallBack;
import com.example.mizuki.chatroomapplication.utils.NetworkConstant;
import com.example.mizuki.chatroomapplication.delegate.ChatListCallBack;
import com.example.mizuki.chatroomapplication.utils.NetworkConstant;

import com.example.mizuki.chatroomapplication.delegate.ChatListCallBack;
import com.example.mizuki.chatroomapplication.utils.NetworkConstant;
<<<<<<< HEAD

=======
>>>>>>> master
>>>>>>> master
>>>>>>> master
>>>>>>> master
>>>>>>> master
>>>>>>> master
>>>>>>> master
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.util.ArrayList;


public class AppModel extends AndroidViewModel {
    public AppModel(@NonNull Application application) {
        super(application);
    }
    public void startLoadingChatList(final ChatListCallBack chatListCallBack){

        getChildDBR().addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                ArrayList<ChatRoom> chatArrayList = new ArrayList<>();
                for (DataSnapshot chatDSS:dataSnapshot.getChildren()
                     ) {

                    ChatRoom chatRoom = chatDSS.getValue(ChatRoom.class);
                    if(chatRoom.getDelete() == 0)
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

        getChildDBR().child(chatRoom.getCreatetime()).setValue(chatRoom);
    }

    public void deleteChatMessage(ChatRoom chatRoom){

        ChatRoom newChatRoom = new ChatRoom();
        newChatRoom.setDate(chatRoom.getDate());
        newChatRoom.setMessage(chatRoom.getMessage());
        newChatRoom.setDelete(Long.valueOf(1));

        getChildDBR().child(chatRoom.getCreatetime()).setValue(newChatRoom);
    }

public DatabaseReference getChildDBR(){

    DatabaseReference chatDBR = FirebaseDatabase.getInstance().getReference();
    DatabaseReference chatChildDBR  = chatDBR.child(NetworkConstant.CHAT_MESSAGE);

    return chatChildDBR;
}

}
