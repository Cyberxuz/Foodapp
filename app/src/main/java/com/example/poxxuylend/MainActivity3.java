package com.example.poxxuylend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent=getIntent();
        int image=intent.getIntExtra("image",0);
        String text=intent.getStringExtra("text");
        String sena=intent.getStringExtra("text2");





        TextView textView=findViewById(R.id.texviewmain3);
        textView.setText(text);



        TextView textView2=findViewById(R.id.texviewmain32);
        textView2.setText(sena);




        ImageView imageView=findViewById(R.id.imageviewmain3);
        imageView.setImageResource(image);
    }
}