package com.wooppay.test.adapter;

/**
 * Created by EasyWay on 17.01.2018.
 */

import java.util.ArrayList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.wooppay.test.entity.Poster;
import com.wooppay.test.R;

public class MyAdapter extends BaseAdapter {

    ArrayList<Poster> data = new ArrayList<Poster>();
    Context context;

    public MyAdapter(Context context, ArrayList<Poster> arr) {
        if (arr != null) {
            data = arr;
        }
        this.context = context;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.size();
    }

    @Override
    public Object getItem(int num) {
        // TODO Auto-generated method stub
        return data.get(num);
    }

    @Override
    public long getItemId(int arg0) {
        return arg0;
    }

    @Override
    public View getView(int i, View someView, ViewGroup arg2) {
        //Получение объекта inflater из контекста
        LayoutInflater inflater = LayoutInflater.from(context);
        //Если someView (View из ListView) вдруг оказался равен
        //null тогда мы загружаем его с помошью inflater
        if (someView == null) {
            someView = inflater.inflate(R.layout.list, arg2, false);
        }
        //Обявляем наши текствьюшки и связываем их с разметкой
        TextView header = (TextView) someView.findViewById(R.id.item_headerText);
        TextView subHeader = (TextView) someView.findViewById(R.id.item_subHeaderText);

        //Устанавливаем в каждую текствьюшку соответствующий текст
        // сначала заголовок
        header.setText(data.get(i).getName());
        // потом подзаголовок
        subHeader.setText(data.get(i).getDescription());
        return someView;
    }

}
