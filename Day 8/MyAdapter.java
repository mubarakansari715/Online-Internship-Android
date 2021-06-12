package com.example.customlistview_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MyAdapter  extends BaseAdapter  {
    int [] img;
    String [] name;
    Context cxt;
    LayoutInflater layoutInflater;

    public MyAdapter(int[] img, String[] name, Context cxt) {
        this.img = img;
        this.name = name;
        this.cxt = cxt;
        layoutInflater =(LayoutInflater.from(cxt));
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.activity_customlayout,null);
        ImageView imgs =(ImageView)convertView.findViewById(R.id.view_img);
        TextView txt =(TextView)convertView.findViewById(R.id.view_text);
        txt.setText(name[position]);
        imgs.setImageResource(img[position]);

        return convertView;
    }
}
