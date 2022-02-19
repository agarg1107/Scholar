package com.example.scholar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class list extends AppCompatActivity {
    RecyclerView recyclerView;
    dap dap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<String> collage = (ArrayList<String>) getIntent().getSerializableExtra("collagelist");
        ArrayList<String> pack = (ArrayList<String>) getIntent().getSerializableExtra("packlist");

        recyclerView = findViewById(R.id.recycler);
        dap = new dap(collage, pack, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(dap);



    }
}