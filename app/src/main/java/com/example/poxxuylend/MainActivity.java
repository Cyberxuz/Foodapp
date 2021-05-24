package com.example.poxxuylend;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Integer> integerArrayList;


    ArrayList<String > stringArrayList;
    ArrayList<String > stringArrayList2;

    com.example.poxxuylend.MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerviewmenu);

        integerArrayList=new ArrayList<>();
        integerArrayList.add(R.drawable.cate1);
        integerArrayList.add(R.drawable.cate2);
        integerArrayList.add(R.drawable.cate3);
        integerArrayList.add(R.drawable.cate4);
        integerArrayList.add(R.drawable.cate5);


        stringArrayList=new ArrayList<>();
        stringArrayList.add(Yordamchi.Lagmon_nomi);
        stringArrayList.add(Yordamchi.Shorva_nomi);
        stringArrayList.add(Yordamchi.Tovuq_nomi);
        stringArrayList.add(Yordamchi.Shashlik_nomi);
        stringArrayList.add(Yordamchi.Shirinlik_nomi);

        stringArrayList2=new ArrayList<>();
        stringArrayList2.add(Yordamchi.Lagmon_soni);
        stringArrayList2.add(Yordamchi.Shorva_soni);
        stringArrayList2.add(Yordamchi.Tovuq_soni);
        stringArrayList2.add(Yordamchi.Shashlik_soni);
        stringArrayList2.add(Yordamchi.Shirinlik_soni);






        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,  false);
        recyclerView.setLayoutManager(layoutManager);

        myAdapter=new com.example.poxxuylend.MyAdapter(MainActivity.this, stringArrayList,stringArrayList2,
                integerArrayList);
        recyclerView.setAdapter(myAdapter);
    }
}