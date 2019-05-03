package com.example.mivok;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.Semaphore;

import static com.example.mivok.R.id.content;
import static com.example.mivok.R.id.list;


   public class Numbers extends AppCompatActivity {


       @Override
       protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.activity_numbers);

           MediaPlayer mediaPlayer;
           final ArrayList<Word> ar = new ArrayList<Word>();

           ar.add(new Word("One", "Lutti", R.drawable.number_one, R.raw.number_one));
           ar.add(new Word("Two", "Otiiko", R.drawable.number_two, R.raw.number_two));
           ar.add(new Word("Three", "Toloookous", R.drawable.number_three, R.raw.number_three));
           ar.add(new Word("Four", "Oyiisa", R.drawable.number_four, R.raw.number_four));
           ar.add(new Word("Five", "Massokka", R.drawable.number_five, R.raw.number_five));
           ar.add(new Word("Six", "Temmokka", R.drawable.number_six, R.raw.number_six));
           ar.add(new Word("Seven", "Kenekaku", R.drawable.number_seven, R.raw.number_seven));
           ar.add(new Word("Eight", "Kawinta", R.drawable.number_eight, R.raw.number_eight));
           ar.add(new Word("Nine", "Wo'e", R.drawable.number_nine, R.raw.number_nine));
           ar.add(new Word("Ten", "Lna'aacha", R.drawable.number_ten, R.raw.number_ten));


           WordAdapter ad = new WordAdapter(this, ar, R.color.numbers);
           ListView list = (ListView) findViewById(R.id.list);
           list.setAdapter(ad);

           list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
               @Override
               public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                   // Toast.makeText(Numbers.this,"List is clicked",Toast.LENGTH_SHORT).show();
                   Word word= ar.get(position);
                   MediaPlayer mediaPlayer=MediaPlayer.create(Numbers.this,word.getaudio());
                   mediaPlayer.start();
               }
           });


       }
       }






