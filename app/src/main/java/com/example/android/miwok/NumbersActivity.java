package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //creating 10 text views containg 10 strings
      //  LinearLayout rootView = (LinearLayout)findViewById(R.id.numbers_root_view);
        final ArrayList<Words> numbersList = new ArrayList<Words>();

        //initializing the numbersList
        numbersList.add(new Words("luttu", "one",R.drawable.number_one,R.raw.number_one));
        numbersList.add(new Words("otiiko", "two",R.drawable.number_two,R.raw.number_two));
        numbersList.add(new Words("tolookosu", "three",R.drawable.number_three,R.raw.number_three));
        numbersList.add(new Words("oyyisa", "four",R.drawable.number_four,R.raw.number_four));
        numbersList.add(new Words("massokka", "five",R.drawable.number_five,R.raw.number_five));
        numbersList.add(new Words("temmokka", "six",R.drawable.number_six,R.raw.number_six));
        numbersList.add(new Words("kenekaku", "seven",R.drawable.number_seven,R.raw.number_seven));
        numbersList.add(new Words("kawinta", "eight",R.drawable.number_eight,R.raw.number_eight));
        numbersList.add(new Words("wo'e", "nine",R.drawable.number_nine,R.raw.number_nine));
        numbersList.add(new Words("na'aacha", "ten",R.drawable.number_ten,R.raw.number_ten));

        /*
        int i = 0;
        while(i < numbersList.size())
        {
            TextView stringHolder = new TextView(this);
            stringHolder.setText(numbersList.get(i));
            rootView.addView(stringHolder);
            i = i + 1;
        }
        */

        WordAdapter itemsAdapter = new WordAdapter(this,numbersList,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        //ListItemListener listener = new ListItemListener();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int pos = i;
                int id = numbersList.get(pos).getmAudioResourceId();
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this,id);
                mMediaPlayer.start();
            }
        });

    }
}
