package com.example.mivok;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;
import java.util.*;
public class Word{
    private String mEnglish;
    private String mMivok;
    private int mimage= NO_IMAGE;
    private static final  int  NO_IMAGE=0;
    private int maudio;


    public Word(String English, String Mivok,int audio) {

        mEnglish =English;
       mMivok = Mivok;
       maudio=audio;


   }
    public  Word(String English,String Mivok,int image,int audio)
    {
        mEnglish =English;
        mMivok = Mivok;
        mimage=image;
        maudio=audio;


    }
    public  String getmEnglish()
    {
        return mEnglish;
    }
    public String getmMivok()
    {
        return mMivok;
    }

    public int getmimage()
    {

        return mimage;
    }


    public boolean hasImage()

    {
        return mimage!=NO_IMAGE;
    }

    public int getaudio()
    {
        return maudio;
    }





}
