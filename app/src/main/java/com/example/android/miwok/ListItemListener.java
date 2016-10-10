package com.example.android.miwok;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

/**
 * Created by vikram singh on 29-08-2016.
 */
public class ListItemListener implements AdapterView.OnItemClickListener {
    Context context;
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Toast.makeText(context,"hello world!",Toast.LENGTH_SHORT).show();
    }
    public ListItemListener(Context context){
        this.context = context.getApplicationContext();
    }
}
