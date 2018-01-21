package com.wooppay.test.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.wooppay.test.adapter.MyAdapter;
import com.wooppay.test.entity.Poster;
import com.wooppay.test.R;
import com.wooppay.test.storage.ArrayStorage;



public class MainActivity extends Activity {
    /** Called when the activity is first created. */

    ListView listView;

    public void addFilm(int id, String name, String description){

            ArrayStorage.INSTANCE.create(id, new Poster(name, description));

        }
    int id = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) this.findViewById(R.id.listView1);
        listView.setAdapter(new MyAdapter(this, ArrayStorage.INSTANCE.posterList));

        String filmName = getIntent().getStringExtra("filmName");
        String description = getIntent().getStringExtra("filmDescription");

        if (filmName != null){

            addFilm(id, filmName, description);

        }
         id ++;

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){


                    public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {

                        long itemId = parent.getAdapter().getItemId(position);

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

