package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //creating 10 text views containg 10 strings
        //  LinearLayout rootView = (LinearLayout)findViewById(R.id.numbers_root_view);
       final  ArrayList<Words> colorsList = new ArrayList<Words>();

        //initializing the COLORsList
        colorsList.add(new Words("weṭeṭṭi", "red",R.drawable.color_red,R.raw.color_red));
        colorsList.add(new Words("chokokki", "green",R.drawable.color_green,R.raw.color_green));
        colorsList.add(new Words("ṭakaakki", "brown",R.drawable.color_brown,R.raw.color_brown));
        colorsList.add(new Words("ṭopoppi", "gray",R.drawable.color_gray,R.raw.color_gray));
        colorsList.add(new Words("kululli", "black",R.drawable.color_black,R.raw.color_black));
        colorsList.add(new Words("kelelli", "white",R.drawable.color_white,R.raw.color_white));
        colorsList.add(new Words("ṭopiisә", "dusty Yellow",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        colorsList.add(new Words("chiwiiṭә", "mustard yellow",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));

        WordAdapter itemsAdapter = new WordAdapter(this,colorsList,R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int pos = i;
                int id = colorsList.get(pos).getmAudioResourceId();
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this,id);
                mMediaPlayer.start();
            }
        });
    }
}
