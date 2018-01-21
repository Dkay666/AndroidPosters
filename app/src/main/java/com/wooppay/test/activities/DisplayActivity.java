package com.wooppay.test.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.wooppay.test.R;
import com.wooppay.test.entity.Poster;
import com.wooppay.test.storage.ArrayStorage;


public class DisplayActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();


        TextView name = (TextView) findViewById(R.id.textView2);
        TextView description = (TextView) findViewById(R.id.textView4);

        long item = intent.getExtras().getLong("itemId");
        int itemId = (int) item ;

        Log.d("artyom", String.valueOf(itemId));



        Poster poster = ArrayStorage.INSTANCE.posterList.get(itemId);
        name.setText(poster.getName());
        description.setText(poster.getDescription());



    }
    public void delete(){

    }
}
