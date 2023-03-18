package com.example.nhom1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    Button btngv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        List<dish> dishList=new ArrayList<dish>();

        dishList.add(new dish("Món 1","120",R.drawable.bf1));
        dishList.add(new dish("Món 2","130",R.drawable.bf2));
        dishList.add(new dish("Món 3","150",R.drawable.bf3));
        dishList.add(new dish("Món 4","60",R.drawable.bf4));
        dishList.add(new dish("Món 5","100", R.drawable.bf5));


        //anhs xaj ben adapter qua
        recyclerView= findViewById(R.id.recycleView);

        dishAdapter dishAdapter=new dishAdapter(dishList);
        recyclerView.setAdapter(dishAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

        btngv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Grid_ViewMainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void anhxa()
    {
        btngv=(Button)findViewById(R.id.btnGridView);

    }
}