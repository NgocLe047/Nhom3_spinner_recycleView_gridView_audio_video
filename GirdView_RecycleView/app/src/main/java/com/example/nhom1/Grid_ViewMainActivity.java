package com.example.nhom1;

import android.os.Bundle;
import android.widget.GridView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Grid_ViewMainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<Hinh> arrayList;
    HinhAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.girdviewactivity_main);
        anhxa();

        arrayList=new ArrayList<>();
        arrayList.add(new Hinh("Cá Kho",R.drawable.a1));
        arrayList.add(new Hinh("Bánh Mì",R.drawable.a2));
        arrayList.add(new Hinh("Mực Xào",R.drawable.a3));
        arrayList.add(new Hinh("Bánh Xèo",R.drawable.a4));
        arrayList.add(new Hinh("Gỏi Cuốn",R.drawable.a5));
        arrayList.add(new Hinh("Cơm Sườn",R.drawable.a6));
        arrayList.add(new Hinh("Rau Trộn",R.drawable.a7));


        adapter=new HinhAdapter(this,R.layout.dong_hinh,arrayList);
        gridView.setAdapter(adapter);



    }
    private void anhxa()
    {
        gridView=(GridView) findViewById(R.id.gv);
    }
}
