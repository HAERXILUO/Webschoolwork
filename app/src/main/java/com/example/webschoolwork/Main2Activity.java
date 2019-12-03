package com.example.webschoolwork;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RecyclerView recyclerView1 = findViewById(R.id.rec_1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(Main2Activity.this));
        recyclerView1.setAdapter(new RecyclerViewAdapter(Main2Activity.this));
        button1 = findViewById(R.id.btn_6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                if (v.getId()==R.id.btn_6)
                {
                    intent = new Intent(Main2Activity.this,Main3Activity.class);

                }
                startActivity(intent);
                finish();
            }
        });

    }


}
