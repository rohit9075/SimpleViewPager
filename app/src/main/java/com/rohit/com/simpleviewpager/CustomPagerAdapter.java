package com.rohit.com.simpleviewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomPagerAdapter extends PagerAdapter {

    private Context context;
    private List<DataModel> dataModelList;

    private LayoutInflater inflater;

    public CustomPagerAdapter(Context context, List<DataModel> dataModelList) {
        this.context = context;
        this.dataModelList = dataModelList;

        this.inflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return dataModelList.size();
    }

    @Override
    public boolean isViewFromObject(View view,Object o) {
        return false;
    }


    @Override
    public Object instantiateItem(ViewGroup container, int position) {

     View view = inflater.inflate(R.layout.viewpager_item, container,false);

        ImageView imageView = view.findViewById(R.id.imageItem);
        TextView textView = view.findViewById(R.id.textview_title);

        DataModel dataModel = dataModelList.get(position);

        imageView.setImageResource(dataModel.imageId);
        textView.setText(dataModel.title);


       container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View) object);
    }
}
