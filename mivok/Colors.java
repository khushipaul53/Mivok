package com.example.mivok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);


        final ArrayList<Word> ar1=new ArrayList<Word>();
        ar1.add(new Word("Red","Wetewetti",R.drawable.color_red,R.raw.color_red));
        ar1.add(new Word("Green","Chokokki",R.drawable.color_green,R.raw.color_green));
        ar1.add(new Word("Brown","Takaakki",R.drawable.color_brown,R.raw.color_brown));
        ar1.add(new Word("Gray","Topoppi",R.drawable.color_gray,R.raw.color_gray));
        ar1.add(new Word("Black","Kulluli",R.drawable.color_black,R.raw.color_black));
        ar1.add(new Word("White","Kelelli",R.drawable.color_white,R.raw.color_white));
        ar1.add(new Word("Dusty Yellow","Topiisa",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        ar1.add(new Word("Mustard Yellow","Chiwiita",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));

        WordAdapter ad=new WordAdapter(this,ar1,R.color.colors);
        ListView list=(ListView)findViewById(R.id.list1);
        list.setAdapter(ad);




        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Toast.makeText(Numbers.this,"List is clicked",Toast.LENGTH_SHORT).show();
                Word word= ar1.get(position);
                MediaPlayer mediaPlayer=MediaPlayer.create(Colors.this,word.getaudio());
                mediaPlayer.start();
            }
        });


    }
}
