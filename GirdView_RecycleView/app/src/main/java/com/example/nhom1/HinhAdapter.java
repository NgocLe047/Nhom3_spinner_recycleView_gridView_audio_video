package com.example.nhom1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class HinhAdapter extends BaseAdapter {

    Context context;
    int layout;
    List<Hinh> arrayList;

    public HinhAdapter(Context context, int layout, List<Hinh> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }


    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private  class ViewHolder{
        TextView tvTen;
        ImageView imgAnh;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(layout,null);
            viewHolder=new ViewHolder();

            //ANH XA
            viewHolder.tvTen=(TextView) view.findViewById(R.id.tvTen);
            viewHolder.imgAnh=(ImageView) view.findViewById(R.id.img);
            view.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) view.getTag();
        }
        viewHolder.tvTen.setText(arrayList.get(i).tenHinh);
        viewHolder.imgAnh.setImageResource(arrayList.get(i).hinhAnh);
        return view;
    }
}
