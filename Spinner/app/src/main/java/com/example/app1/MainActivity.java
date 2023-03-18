package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner foodSpinner = findViewById(R.id.spinner);

        List<Food> foodList = new ArrayList<>();
        foodList.add(new Food(1,"Pizza", R.drawable.pizza));
        foodList.add(new Food(2,"Burger", R.drawable.burger));
        foodList.add(new Food(3,"Sushi", R.drawable.sushi));
        foodList.add(new Food(4,"Taco", R.drawable.taco));

        FoodSpinnerAdapter adapter = new FoodSpinnerAdapter(this, foodList);
        foodSpinner.setAdapter(adapter);

        foodSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Xử lý sự kiện khi người dùng chọn 1 món ăn
                Food food = (Food) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Bạn đã chọn: " + food.getTen(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Không làm gì khi không có món ăn nào được chọn
            }
        });



    }
}