package com.example.baitap1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;


import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ConstraintLayout bg= (ConstraintLayout) findViewById(R.id.constraintLayout1);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(R.drawable.bg1);
        arrayList.add(R.drawable.bg2);
        arrayList.add(R.drawable.bg3);
        arrayList.add(R.drawable.bg4);
        Random random = new Random();
        int vitri = random.nextInt(arrayList.size());
        bg.setBackgroundResource(arrayList.get(vitri));
    }
}