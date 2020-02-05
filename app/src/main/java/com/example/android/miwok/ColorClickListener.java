package com.example.android.miwok;

import android.content.Intent;
import android.view.View;

public class ColorClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(view.getContext(),ColorActivity.class);

        view.getContext().startActivity(intent);
    }
}
