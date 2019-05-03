package com.example.mivok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView Numbers=findViewById(R.id.numbers);

        Numbers.setOnClickListener(new OnClickListener()
        {
         @Override
         public void onClick(View view){

             Intent numbersIntent=new Intent(MainActivity.this,Numbers.class);
             startActivity(numbersIntent);
         }
        });


        TextView Family=findViewById(R.id.Family);
        Family.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent familyIntent=new Intent(MainActivity.this,Family.class);
                startActivity(familyIntent);
            }
        });


        TextView Colors=findViewById(R.id.Colors);
        Colors.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent colorsIntent=new Intent(MainActivity.this,Colors.class);
                startActivity(colorsIntent);
            }
        });


        TextView Phrases=findViewById(R.id.Phrases);
        Phrases.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent PhrasesIntent=new Intent(MainActivity.this,Phrases.class);
                startActivity(PhrasesIntent);
            }

        });

    }
}
