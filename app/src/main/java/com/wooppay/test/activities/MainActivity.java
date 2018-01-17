package com.wooppay.test.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.wooppay.test.adapter.MyAdapter;
import com.wooppay.test.entity.Poster;
import com.wooppay.test.R;

import java.util.ArrayList;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    public static final String EXTRA_MESSAGE = "com.wooppay.test.MESSAGE";

    ListView lv;
    ArrayList<Poster> data = new ArrayList<Poster>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data.add(new Poster("Заголовок1","Подзаголовок1"));
        data.add(new Poster("Заголовок2","Подзаголовок2"));
        data.add(new Poster("Заголовок3","Подзаголовок3"));
        data.add(new Poster("Заголовок4","Подзаголовок4"));
        data.add(new Poster("Заголовок5","Подзаголовок5"));
        lv = (ListView) this.findViewById(R.id.listView1);
        lv.setAdapter(new MyAdapter(this,data));

        String filmName = getIntent().getStringExtra("filmName");
        String description = getIntent().getStringExtra("filmDescription");

        if (filmName != null){
            data.add(new Poster(filmName, description));
        }

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){


                    public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                        TextView textView = (TextView) itemClicked;
                        String filmName = textView.getText().toString();
                        Intent intent = new Intent(getApplicationContext(), DisplayActivity.class);
                        intent.putExtra(EXTRA_MESSAGE, filmName);
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

