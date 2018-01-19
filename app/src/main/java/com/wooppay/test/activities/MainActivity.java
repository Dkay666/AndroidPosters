package com.wooppay.test.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TableRow;
import android.widget.TextView;

import com.wooppay.test.adapter.MyAdapter;
import com.wooppay.test.entity.Poster;
import com.wooppay.test.R;
import com.wooppay.test.storage.ArrayStorage;

import java.util.ArrayList;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */


    ListView lv;
    ArrayStorage storage = new ArrayStorage();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storage.create(new Poster("Заголовок1", "Подзаголовок1"));
        storage.create(new Poster("Заголовок2", "Подзаголовок2"));
        storage.create(new Poster("Заголовок3", "Подзаголовок3"));
        storage.create(new Poster("Заголовок4", "Подзаголовок4"));
        storage.create(new Poster("Заголовок5", "Подзаголовок5"));


        lv = (ListView) this.findViewById(R.id.listView1);
        lv.setAdapter(new MyAdapter(this, storage.posterList));

        String filmName = getIntent().getStringExtra("filmName");
        String description = getIntent().getStringExtra("filmDescription");

        if (filmName != null){
            storage.create(new Poster(filmName, description));
        }

        lv.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){


                    public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {



                        long itemId = parent.getAdapter().getItemId(position);
Log.d("artyom", String.valueOf(itemId));
                        Intent intent = new Intent(getApplicationContext(), DisplayActivity.class);

                        intent.putExtra("itemId", itemId);
                        startActivity(intent);

                    }
                }
        );
    }
    public void addFilm(View view){
        Intent intent = new Intent(this, AddFilm.class);

        startActivity(intent);
    }


}

