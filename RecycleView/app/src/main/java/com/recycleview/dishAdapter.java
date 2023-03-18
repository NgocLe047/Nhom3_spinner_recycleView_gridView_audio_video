package com.recycleview;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class dishAdapter extends RecyclerView.Adapter<dishAdapter.MyViewHolder>{ //tao methor

    private List<dish> listDish;

    public dishAdapter(List<dish> listDish) {
        this.listDish = listDish;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) { // bản chất là lấy view của my_item bỏ vào MyViewHolder
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_item,parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public int getItemCount() { // trả về cái data dislish có bao nhiu
        return listDish.size();
    }
    // for(int position=0;position <listDish.size();position ++)
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        dish dish=listDish.get(position);
        holder.imgView.setImageResource(dish.getImageID());
        holder.txtView.setText(dish.getName());
        holder.txtP.setText(    dish.getPrice());
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private CardView cardView;
        private ImageView imgView;
        private TextView txtView;
        private TextView txtP;

        public MyViewHolder (@NonNull View itemView) {
            super(itemView);
            //ánh xạ từ cái file xml qua
            cardView=itemView.findViewById(R.id.cardView );
            imgView=itemView.findViewById(R.id.imgV);
            txtView=itemView.findViewById(R.id.txtV);
            txtP=itemView.findViewById(R.id.txtP);
        }
    }
}
