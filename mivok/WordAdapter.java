package com.example.mivok;

import android.app.Activity;
import android.content.Context;
import android.provider.UserDictionary;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

         private int mcolor;


    public WordAdapter(Activity context, ArrayList<Word> Word,int color) {


        super(context, 0, Word);
        mcolor=color;
    }


    public View getView(int position, View convertView, ViewGroup parent) {

        Word convertWordAdapter = getItem(position);

        View list = convertView;
        if (list == null) {
            list = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView MivokTextView = (TextView) list.findViewById(R.id.mivok_id);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        MivokTextView.setText(currentWord.getmMivok());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView englishtextView = (TextView) list.findViewById(R.id.english_id);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        englishtextView.setText(currentWord.getmEnglish());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView imageView= (ImageView)list.findViewById(R.id.image);

            imageView.setImageResource(currentWord.getmimage());


        if(currentWord.hasImage()) {

            imageView.setImageResource(currentWord.getmimage());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        View text=list.findViewById(R.id.text_container);
        int color1=ContextCompat.getColor(getContext(),mcolor);
        text.setBackgroundColor(color1);
        return list;

    }
}