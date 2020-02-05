package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Rot", "red"));
        words.add(new Word("Gelb", "yellow"));
        words.add(new Word("Orange", "orange"));
        words.add(new Word("Schwarz", "black"));
        words.add(new Word("Weiss", "white"));
        words.add(new Word("Violett", "purple"));
        words.add(new Word("Grün", "green"));
        words.add(new Word("Blau", "blue"));
        words.add(new Word("Grau", "grey"));
        words.add(new Word("Türkis", "turquoise"));


        WordAdapter adapter = new WordAdapter(this, words);


        ListView listView = (ListView) findViewById(R.id.colorsListView);

        listView.setAdapter(adapter);
    }
}
