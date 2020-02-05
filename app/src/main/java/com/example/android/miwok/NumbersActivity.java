package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("eins", "one"));
        words.add(new Word("zwei", "two"));
        words.add(new Word("drei", "three"));
        words.add(new Word("vier", "four"));
        words.add(new Word("fünf", "five"));
        words.add(new Word("sechs", "six"));
        words.add(new Word("sieben", "seven"));
        words.add(new Word("acht", "eight"));
        words.add(new Word("neun", "nine"));
        words.add(new Word("zehn", "ten"));


        WordAdapter adapter = new WordAdapter(this, words);


        ListView listView = (ListView) findViewById(R.id.numbersListView);

        listView.setAdapter(adapter);
    }


}

