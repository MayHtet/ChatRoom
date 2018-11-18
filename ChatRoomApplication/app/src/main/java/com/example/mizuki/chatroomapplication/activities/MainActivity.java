package com.example.mizuki.chatroomapplication.activities;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mizuki.chatroomapplication.R;

<<<<<<< Updated upstream
=======
import java.util.List;

>>>>>>> Stashed changes
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< Updated upstream

    }

    @Override
    protected boolean setDisplayHomeEnabled() {
        return false;
=======
        setContentView(R.layout.activity_main);
        getmAppModel().startLoadingNoteList(new NoteListCallBack() {
            @Override
            public void loadNoteList(List<ContactsContract.CommonDataKinds.Note> noteList) {

                setupRecyclerView(noteList);
                //Toast.makeText(MainActivity.this,"Size is "+noteList.size(),Toast.LENGTH_SHORT).show();
            }
        });
>>>>>>> Stashed changes
    }

    @Override
    public int getLayout() {
<<<<<<< Updated upstream
        return R.layout.activity_main;
=======
        return 0;
>>>>>>> Stashed changes
    }
}
