package com.wooppay.test.entity;

/**
 * Created by EasyWay on 17.01.2018.
 */

public class Poster {

    String name;


    String description;

    public Poster(){}

  public Poster(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
