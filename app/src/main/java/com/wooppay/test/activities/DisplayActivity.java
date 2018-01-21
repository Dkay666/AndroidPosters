package com.wooppay.test.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import com.wooppay.test.R;
import com.wooppay.test.entity.Poster;
import com.wooppay.test.storage.ArrayStorage;


public class DisplayActivity extends AppCompatActivity {

    int itemId;
    EditText name;
    EditText description;
    Poster poster;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();


         name = (EditText) findViewById(R.id.editText3);
         description = (EditText) findViewById(R.id.editText4);

         itemId = (int) intent.getExtras().getLong("itemId");

         poster = ArrayStorage.INSTANCE.read(itemId);

        name.setText(poster.getName());
        description.setText(poster.getDescription());

    }
    public void delete(View view){

        Intent intent = new Intent(this, MainActivity.class);

        ArrayStorage.INSTANCE.delete(itemId);

        startActivity(intent);

    }
    public void update(View view){

        Intent intent = new Intent(this, MainActivity.class);

        poster.setName(name.getText().toString());
        poster.setDescription(description.getText().toString());

        startActivity(intent);

    }
}
