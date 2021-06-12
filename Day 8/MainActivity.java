package com.example.customlistview_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView listView;
int []img ={R.drawable.profile,R.drawable.w1,R.drawable.w2,R.drawable.w3};
String [] name ={"Mubarak","Car1","Car2","Car3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =findViewById(R.id.view_list);
        MyAdapter myAdapter =new MyAdapter(img,name,this);
        listView.setAdapter(myAdapter);




    }
}