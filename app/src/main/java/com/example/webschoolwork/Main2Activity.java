package com.example.webschoolwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RecyclerView recyclerView1 = findViewById(R.id.rec_1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(Main2Activity.this));
        recyclerView1.setAdapter(new RecyclerViewAdapter(Main2Activity.this));
    }
}
