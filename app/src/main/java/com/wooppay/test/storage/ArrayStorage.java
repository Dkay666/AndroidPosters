package com.wooppay.test.storage;

import android.util.Log;

import com.wooppay.test.entity.Poster;

import java.util.ArrayList;


/**
 * Created by EasyWay on 18.01.2018.
 */

public class ArrayStorage {

     public ArrayList<Poster> posterList = new ArrayList<>();



    public void create(Poster poster){


        posterList.add(poster);

    }
    public void delete(int id){
        posterList.remove(id);
    }

    public Poster read (int id) throws IndexOutOfBoundsException{
Log.d("artyom", String.valueOf(posterList.get(id)));
   return posterList.get(id);


    }
}
