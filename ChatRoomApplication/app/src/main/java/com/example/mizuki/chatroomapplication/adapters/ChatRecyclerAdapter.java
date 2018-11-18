package com.example.mizuki.chatroomapplication.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.ViewGroup;

import com.example.mizuki.chatroomapplication.R;
import com.example.mizuki.chatroomapplication.data.vos.ChatRoom;
import com.example.mizuki.chatroomapplication.viewholders.BaseViewHolder;
import com.example.mizuki.chatroomapplication.viewholders.ChatViewHolder;

public class ChatRecyclerAdapter<E extends BaseViewHolder> extends BaseRecyclerAdapter<BaseViewHolder,ChatRoom> {

    public ChatRecyclerAdapter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ChatViewHolder(layoutInflater.inflate(R.layout.item_view_chat_room,viewGroup,false));
    }

}
