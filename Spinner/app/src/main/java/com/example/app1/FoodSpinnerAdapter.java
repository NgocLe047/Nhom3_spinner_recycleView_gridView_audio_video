package com.example.app1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FoodSpinnerAdapter extends BaseAdapter {
    private Context mContext;
    private List<Food> mFoodList;

    public FoodSpinnerAdapter(Context context, List<Food> foodList) {
        mContext = context;
        mFoodList = foodList;
    }

    @Override
    public int getCount() {
        return mFoodList.size();
    }

    @Override
    public Object getItem(int position) {
        return mFoodList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.mon_an, parent, false);
        }

        ImageView imageView = view.findViewById(R.id.food_image_view);
        TextView textView = view.findViewById(R.id.food_name_text_view);

        Food food = mFoodList.get(position);
        imageView.setImageResource(food.getIDHinh());
        textView.setText(food.getTen());

        return view;
    }
}


