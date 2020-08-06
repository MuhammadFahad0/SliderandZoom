package com.shehrozkamran.sliderandzoom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class list extends AppCompatActivity {

    List<Integer> list;
    RecyclerView RC;
    LinearLayoutManager manager;
    adrapter adp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RC = findViewById(R.id.rc);
        manager = new LinearLayoutManager(this);
        RC.setLayoutManager(manager);
        list = new ArrayList<>();

        list.add(R.drawable.a1);
        list.add(R.drawable.a2);
        list.add(R.drawable.a3);
        list.add(R.drawable.a4);
        list.add(R.drawable.a5);


        adp = new adrapter(list.this,list);
        RC.setAdapter(adp);


    }
}