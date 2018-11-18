package com.example.mizuki.chatroomapplication;

import com.example.mizuki.chatroomapplication.data.vos.ChatRoom;

import java.util.List;

public interface ChatListCallBack {
    void loadChatList(List<ChatRoom> chatRoomList);
}
