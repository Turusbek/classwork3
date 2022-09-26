package com.example.classwork3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Owl");
        animals.add("Dog");
        animals.add("Monkey");
        animals.add("Donkey");
        animals.add("Pig");
        animals.add("Tiger");
        animals.add("Horse");
        animals.add("Mouse");
        animals.add("Zebra");
        animals.add("Panda");
        animals.add("Bear");
        animals.add("Crocodile");
        AnimalAdapter adapter = new  AnimalAdapter(animals);
        recyclerView.setAdapter(adapter);

    }

}