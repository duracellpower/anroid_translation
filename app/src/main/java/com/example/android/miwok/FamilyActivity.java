package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Bruder", "brother"));
        words.add(new Word("Schwester", "sister"));
        words.add(new Word("Mutter", "mother"));
        words.add(new Word("Vater", "darth vader"));
        words.add(new Word("Grossvater", "grandfather"));
        words.add(new Word("Grossmutter", "grandmother"));
        words.add(new Word("Katze", "cat"));
        words.add(new Word("Hund", "dog"));
        words.add(new Word("Spinne", "Spider"));
        words.add(new Word("Vogel", "Bird"));


        WordAdapter adapter = new WordAdapter(this, words);


        ListView listView = (ListView) findViewById(R.id.familyListView);

        listView.setAdapter(adapter);
    }
}
