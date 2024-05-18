package com.example.recyclerview_test.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_test.R;
import com.example.recyclerview_test.adapter.RecyclerviewAdapter;
import com.example.recyclerview_test.data.DataModel;

import java.util.ArrayList;


public class SubActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    RecyclerviewAdapter recyClerViewAdapter;

    LinearLayoutManager linearLayoutManager;

    ArrayList<DataModel> dataModelArrayList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivity);

        dataModelArrayList = new ArrayList<DataModel>();

        dataModelArrayList = (ArrayList<DataModel>) getIntent().getSerializableExtra("DataModels");


        recyclerView = findViewById(R.id.rv_newsArticle);
        recyClerViewAdapter = new RecyclerviewAdapter();

        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setAdapter(recyClerViewAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

       recyClerViewAdapter.setDatamModelList(dataModelArrayList);
    }



}
