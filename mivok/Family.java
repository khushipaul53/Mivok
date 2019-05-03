package com.example.mivok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);


     final   ArrayList<Word> ar2=new ArrayList<Word>();
        ar2.add(new Word("Father","Apa",R.drawable.family_father,R.raw.family_father));
        ar2.add(new Word("Mother","Ata",R.drawable.family_mother,R.raw.family_mother));
        ar2.add(new Word("Son","Angsi",R.drawable.family_son,R.raw.family_son));
        ar2.add(new Word("Daughter","Tune",R.drawable.family_daughter,R.raw.family_daughter));
        ar2.add(new Word("Older Brother","Taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        ar2.add(new Word("Younger Brother","Chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        ar2.add(new Word("Older Sister","Tete",R.drawable.family_older_sister,R.raw.family_older_sister));
        ar2.add(new Word("Younger Sister","Kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        ar2.add(new Word("Grand Mother","Ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        ar2.add(new Word("Grand Father","Paapa",R.drawable.family_grandfather,R.raw.family_grandfather));

       WordAdapter ad=new WordAdapter(this,ar2,R.color.family);
        ListView list=(ListView)findViewById(R.id.list2);
        list.setAdapter(ad);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Toast.makeText(Numbers.this,"List is clicked",Toast.LENGTH_SHORT).show();
                Word word= ar2.get(position);
                MediaPlayer mediaPlayer=MediaPlayer.create(Family.this,word.getaudio());
                mediaPlayer.start();
            }
        });

    }
}
