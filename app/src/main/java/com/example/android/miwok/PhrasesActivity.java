package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //creating 10 text views containg 10 strings
        //  LinearLayout rootView = (LinearLayout)findViewById(R.id.numbers_root_view);
        final ArrayList<Words> phrasesList = new ArrayList<Words>();

        //initializing the COLORsList
        phrasesList.add(new Words("minto wuksus", "Where are you going?",R.raw.phrase_where_are_you_going));
        phrasesList.add(new Words("tinnә oyaase'nә", "What is your name?",R.raw.phrase_what_is_your_name));
        phrasesList.add(new Words("oyaaset...", "My name is",R.raw.phrase_my_name_is));
        phrasesList.add(new Words("michәksәs?", "How are you feeling?",R.raw.phrase_how_are_you_feeling));
        phrasesList.add(new Words("kuchi achit", "I’m feeling good.",R.raw.phrase_im_feeling_good));
        phrasesList.add(new Words("әәnәs'aa?", "Are you coming?",R.raw.phrase_are_you_coming));
        phrasesList.add(new Words("hәә’ әәnәm", "Yes I'm coming",R.raw.phrase_yes_im_coming));
        phrasesList.add(new Words("әәnәm", "I'm coming",R.raw.phrase_im_coming));
        phrasesList.add(new Words("yoowutis", "Let's go",R.raw.phrase_lets_go));
        phrasesList.add(new Words("әnni'nem", "Come here",R.raw.phrase_come_here));

        WordAdapter itemsAdapter = new WordAdapter(this,phrasesList,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int pos = i;
                int id = phrasesList.get(pos).getmAudioResourceId();
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this,id);
                mMediaPlayer.start();
            }
        });
    }
}
