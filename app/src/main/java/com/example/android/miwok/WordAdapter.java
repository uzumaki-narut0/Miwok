package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Kumar Swapnil on 20-08-2016.
 */
public class WordAdapter extends ArrayAdapter<Words>{
    private int mBackgroundColorId;
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
       Words currentWord =  getItem(position);
       if(listItemView == null)
       {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
       }
        TextView tv = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        TextView tv2 = (TextView) listItemView.findViewById(R.id.default_text_view);
        tv.setText(currentWord.getMiwokTranslation());
        tv2.setText(currentWord.getDefaultTranslation());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        LinearLayout ll = (LinearLayout) listItemView.findViewById(R.id.linear_2);
        int color = ContextCompat.getColor(getContext(),mBackgroundColorId);
        ll.setBackgroundColor(color);

        if(currentWord.hasImageResourceId() != -1)
        {
            iconView.setImageResource(currentWord.getmImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }
        else
        {
            iconView.setVisibility(View.GONE);
        }

        return listItemView;
    }

    public WordAdapter(Context context, ArrayList<Words> numbersList, int backgroundColorId)
    {
        super(context,0,numbersList);
        this.mBackgroundColorId = backgroundColorId;

    }
}
