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

        LayoutInflater inflater = LayoutInflater.from(context);

        if (someView == null) {
            someView = inflater.inflate(R.layout.list, arg2, false);
        }

        TextView header = (TextView) someView.findViewById(R.id.item_headerText);
        TextView subHeader = (TextView) someView.findViewById(R.id.item_subHeaderText);


        header.setText(data.get(i).getName());

        subHeader.setText(data.get(i).getDescription());
        return someView;
    }

}
