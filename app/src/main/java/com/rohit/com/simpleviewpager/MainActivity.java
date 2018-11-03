package com.rohit.com.simpleviewpager;

import android.provider.ContactsContract;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<DataModel> list = getDataList();

        ViewPager viewPager = findViewById(R.id.viewPager);

        CustomPagerAdapter adapter = new CustomPagerAdapter(MainActivity.this, list);

        viewPager.setAdapter(adapter);

    }


    public List<DataModel> getDataList(){

        List<DataModel> dataList = new ArrayList<>();

        int[] imageId = new int[]{

                R.drawable.image_one ,  R.drawable.image_two
        };

        String[] titles = new String[] {
                "Image One" , "Image tow", "Image three", "Image four", "Image Five", "Image Six"
        };


        int count = imageId.length;

        for (int i = 0; i < count; i++) {
            dataList.add(new DataModel(imageId[i], titles[i]));

        }

        return  dataList;

    }

}
