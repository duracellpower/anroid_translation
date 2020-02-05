package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Essen ist Liebe", "Food is love"));
        words.add(new Word("Tanzen ist Leidenschaft", "dancing is passion"));
        words.add(new Word("Ein Auto bedeutet Freiheit", "a car meand freedom"));
        words.add(new Word("Geld ist nicht alles", "money isn't everything"));
        words.add(new Word("Weiss", "white"));
        words.add(new Word("Violett", "purple"));
        words.add(new Word("Grün", "green"));
        words.add(new Word("Blau", "blue"));
        words.add(new Word("Grau", "grey"));
        words.add(new Word("Türkis", "turquoise"));


        WordAdapter adapter = new WordAdapter(this, words);


        ListView listView = (ListView) findViewById(R.id.phrasesListView);

        listView.setAdapter(adapter);
    }
}
