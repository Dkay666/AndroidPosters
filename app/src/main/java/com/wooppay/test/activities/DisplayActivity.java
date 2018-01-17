package com.wooppay.test.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.wooppay.test.R;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        String filmName = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String filmDescription = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView name = (TextView) findViewById(R.id.textView2);
        TextView description = (TextView) findViewById(R.id.textView4);

        name.setText(filmName);
        description.setText(filmDescription);

    }
}
