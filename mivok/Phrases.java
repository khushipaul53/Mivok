package com.example.mivok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        final   ArrayList<Word> ar3=new ArrayList<Word>();

        ar3.add(new Word("Where are you going","Minto Wuksus",R.raw.phrase_where_are_you_going));
        ar3.add(new Word("What is your name?","Tinna oyaase'ne",R.raw.phrase_what_is_your_name));
        ar3.add(new Word("My name is...","oyaaset...",R.raw.phrase_my_name_is));
        ar3.add(new Word("How are you feeling??","Michaksas",R.raw.phrase_how_are_you_feeling));
        ar3.add(new Word("I,m feeling good"," Kuchi achit",R.raw.phrase_im_feeling_good));
        ar3.add(new Word("Are you coming","Aanas'aa",R.raw.phrase_are_you_coming));
        ar3.add(new Word("Let's go!!","Yoowutis",R.raw.phrase_lets_go));
        ar3.add(new Word("Come Here!!!","Anni'nem",R.raw.phrase_come_here));

        WordAdapter ad=new WordAdapter(this,ar3,R.color.phrases);
        ListView list=(ListView)findViewById(R.id.list4);
        list.setAdapter(ad);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Toast.makeText(Numbers.this,"List is clicked",Toast.LENGTH_SHORT).show();
                Word word= ar3.get(position);
                MediaPlayer mediaPlayer=MediaPlayer.create(Phrases.this,word.getaudio());
                mediaPlayer.start();
            }
        });


    }
}
