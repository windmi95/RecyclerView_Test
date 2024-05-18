package com.example.recyclerview_test.activity;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_test.R;
import com.example.recyclerview_test.adapter.RecyclerviewAdapter;


public class SubActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    RecyclerviewAdapter recyClerViewAdapter;

    LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        recyclerView = findViewById(R.id.rv_newsArticle);

        recyClerViewAdapter = new RecyclerviewAdapter();

        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setAdapter(recyClerViewAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyClerViewAdapter.setDatamModelList();
    }



}
