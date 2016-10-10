package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //creating 10 text views containg 10 strings
        //  LinearLayout rootView = (LinearLayout)findViewById(R.id.numbers_root_view);
        final ArrayList<Words> familyList = new ArrayList<Words>();

        //initializing the COLORsList
        familyList.add(new Words("әpә", "father",R.drawable.family_father,R.raw.family_father));
        familyList.add(new Words("әṭa", "mother",R.drawable.family_mother,R.raw.family_mother));
        familyList.add(new Words("angsi", "son",R.drawable.family_son,R.raw.family_son));
        familyList.add(new Words("tune", "daughter",R.drawable.family_daughter,R.raw.family_daughter));
        familyList.add(new Words("taachi", "older brother",R.drawable.family_older_brother,R.raw.family_older_brother));
        familyList.add(new Words("chalitti", "younger brother",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        familyList.add(new Words("teṭe", "older sister",R.drawable.family_older_sister,R.raw.family_older_sister));
        familyList.add(new Words("kolliti", "younger sister",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        familyList.add(new Words("ama", "grandmother",R.drawable.family_grandmother,R.raw.family_grandmother));
        familyList.add(new Words("paapa", "grandfather",R.drawable.family_grandfather,R.raw.family_grandfather));

        WordAdapter itemsAdapter = new WordAdapter(this,familyList,R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int pos = i;
                int id = familyList.get(pos).getmAudioResourceId();
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this,id);
                mMediaPlayer.start();
            }
        });
    }
}
