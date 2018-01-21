package com.wooppay.test.storage;

import android.util.Log;

import com.wooppay.test.entity.Poster;

import java.util.ArrayList;


/**
 * Created by EasyWay on 18.01.2018.
 */

public enum ArrayStorage {
INSTANCE;
     public ArrayList<Poster> posterList = new ArrayList<>();


public void create(int id, Poster poster){
    posterList.add(id, poster);
}


    public void delete(int id){
        posterList.remove(id);
    }

    public Poster read (int id){

   return posterList.get(id);


    }


}
