package com.wooppay.test.entity;

/**
 * Created by EasyWay on 17.01.2018.
 */

public class Poster {
    /**
     * Заголовок
     */
    String name;

    /**
     * Подзаголовок
     */
    String description;

    /**
     * Конструктор создает новый элемент в соответствии с передаваемыми
     * параметрами:
     * @param h - заголовок элемента
     * @param s - подзаголовок
     */
  public Poster(String name, String description){
        this.name = name;
        this.description = description;
    }

    //Всякие гетеры и сеттеры
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
