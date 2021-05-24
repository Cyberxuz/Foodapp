package com.example.poxxuylend;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyviewHolder> {
    Context context;
    ArrayList<String > stringArrayList;
    ArrayList<String > stringArrayList2;
    ArrayList<Integer> integerArrayList;


    public MyAdapter(Context context, ArrayList<String> stringArrayList, ArrayList<String> stringArrayList2, ArrayList<Integer> integerArrayList) {
        this.context = context;
        this.stringArrayList = stringArrayList;
        this.stringArrayList2 = stringArrayList2;
        this.integerArrayList = integerArrayList;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recyclerviewcategory1,parent,false);


        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position) {
        holder.textView.setText(stringArrayList.get(position).toString());
        holder.textView1.setText(stringArrayList2.get(position).toString());
        holder.imageView.setImageResource(integerArrayList.get(position));
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(context,MainActivity3.class);
                intent.putExtra("image",integerArrayList.get(position));
                intent.putExtra("text",stringArrayList.get(position));
                intent.putExtra("text2",stringArrayList2.get(position));



                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return integerArrayList.size();
    }

    public  static class MyviewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView,textView1,textView2;
        LinearLayout linearLayout;
        public MyviewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageview1);
            textView=itemView.findViewById(R.id.textview1);
            textView1=itemView.findViewById(R.id.textview12);
            linearLayout=itemView.findViewById(R.id.linercate1);

        }
    }
}
