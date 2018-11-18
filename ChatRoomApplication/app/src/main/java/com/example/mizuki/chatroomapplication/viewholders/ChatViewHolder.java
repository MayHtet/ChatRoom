package com.example.mizuki.chatroomapplication.viewholders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.example.mizuki.chatroomapplication.R;
import com.example.mizuki.chatroomapplication.data.vos.ChatRoom;

import org.w3c.dom.Text;

import butterknife.BindView;

public class ChatViewHolder extends BaseViewHolder<ChatRoom>  {
    @BindView(R.id.tv_message)
    TextView tvMessage;

    public ChatViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    @Override
    public void bind(Context context) {
        tvMessage.setText(mData.getDate());
    }

    @Override
    public void onClick(View view) {

    }
}
