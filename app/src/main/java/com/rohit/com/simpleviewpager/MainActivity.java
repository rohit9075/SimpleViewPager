package com.rohit.com.simpleviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public List<DataModel> getDataList(){

        List<DataModel> dataList = new ArrayList<>();

        int[] imageId = new int[]{

                R.drawable.image_one ,  R.drawable.image_two, R.drawable.image_three, R.drawable.image_four,
                R.drawable.image_five, R.drawable.image_six
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
