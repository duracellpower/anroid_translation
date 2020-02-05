/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // new instance of the event loistener, Schritt 2
        NumbersClickListener numbersClickListener = new NumbersClickListener();
        TextView numbers = (TextView)findViewById(R.id.numbers);

        FamilyClickListener familyClickListener = new FamilyClickListener();
        TextView family = (TextView)findViewById(R.id.family);

        ColorClickListener colorClickListener = new ColorClickListener();
        TextView colors = (TextView)findViewById(R.id.colors);

        PhrasesClickListener phrasesClickListener = new PhrasesClickListener();
        TextView phrases = (TextView)findViewById(R.id.phrases);


        // attach listener to view, Schritt 3
        numbers.setOnClickListener(numbersClickListener);
        family.setOnClickListener(familyClickListener);
        colors.setOnClickListener(colorClickListener);
        phrases.setOnClickListener(phrasesClickListener);


    }
}
