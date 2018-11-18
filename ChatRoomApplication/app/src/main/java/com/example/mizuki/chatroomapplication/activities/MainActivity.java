package com.example.mizuki.chatroomapplication.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mizuki.chatroomapplication.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
