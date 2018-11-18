package com.example.mizuki.chatroomapplication.activities;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.mizuki.chatroomapplication.R;
import com.example.mizuki.chatroomapplication.adapters.ChatRecyclerAdapter;
import com.example.mizuki.chatroomapplication.data.vos.ChatRoom;
import com.example.mizuki.chatroomapplication.delegate.ChatListCallBack;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;


public class MainActivity extends BaseActivity {
    @BindView(R.id.rv_chat_room)
    RecyclerView rvChatRoom;
    @BindView(R.id.et_message)
    EditText etMessage;
    @BindView(R.id.btn_send)
    Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getmAppModel().startLoadingChatList(new ChatListCallBack() {
            @Override
            public void loadChatList(List<ChatRoom> chatRoomList) {
                setupRecyclerView(chatRoomList);
                Toast.makeText(MainActivity.this,"Size is "+chatRoomList.size(),Toast.LENGTH_SHORT).show();

            }
        });
    }

    @OnClick(R.id.btn_send)
    public void onTabButton(){
        String message = etMessage.getText().toString();


    }
    private void setupRecyclerView(List<ChatRoom> chatList) {

       ChatRecyclerAdapter chatRecyclerAdapter = new ChatRecyclerAdapter(this);
        rvChatRoom.setLayoutManager(new LinearLayoutManager(this));
        rvChatRoom.setAdapter(chatRecyclerAdapter);
        chatRecyclerAdapter.setmDataList(chatList);
    }

    @Override
    protected boolean setDisplayHomeEnabled() {
        return false;

    }

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }
}
