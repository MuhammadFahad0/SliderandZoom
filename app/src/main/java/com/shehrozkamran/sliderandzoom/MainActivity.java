package com.shehrozkamran.sliderandzoom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    Integer position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager2 = findViewById(R.id.viewpager);
        List<SliderItem> sliderItems = new ArrayList<SliderItem>();
        sliderItems.add(new SliderItem(R.drawable.a1,"Page # 1"));
        sliderItems.add(new SliderItem(R.drawable.a2,"Page # 2"));
        sliderItems.add(new SliderItem(R.drawable.a3,"Page # 3"));
        sliderItems.add(new SliderItem(R.drawable.a4,"Page # 4"));
        sliderItems.add(new SliderItem(R.drawable.a5,"Page # 5"));
        sliderItems.add(new SliderItem(R.drawable.a6,"Page # 6"));
        sliderItems.add(new SliderItem(R.drawable.a7,"Page # 7"));
        sliderItems.add(new SliderItem(R.drawable.a8,"Page # 8"));

        viewPager2.setAdapter(new SliderAdrapter(sliderItems,0));

    }
}