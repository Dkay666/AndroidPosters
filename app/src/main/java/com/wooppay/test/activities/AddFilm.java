package com.wooppay.test.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.wooppay.test.R;


public class AddFilm extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_film);
    }
    public void addFilm(View view){
        Intent intent = new Intent(this, MainActivity.class);

        EditText name = (EditText) findViewById(R.id.editText);
        EditText description = (EditText) findViewById(R.id.editText2);

        String filmName = name.getText().toString();

        String filmDescription = description.getText().toString();


        intent.putExtra("filmName", filmName);
        intent.putExtra("filmDescription", filmDescription);


        startActivity(intent);

    }
}
