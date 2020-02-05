package com.example.android.miwok;

import android.content.Intent;
import android.view.View;

public class PhrasesClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(view.getContext(),PhrasesActivity.class);

        view.getContext().startActivity(intent);
    }
}
