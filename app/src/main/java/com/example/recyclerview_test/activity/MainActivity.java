package com.example.recyclerview_test.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.recyclerview_test.R;
import com.example.recyclerview_test.data.DataModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<DataModel> DataModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataModels = new ArrayList<DataModel>();

        Button move_btn_business = (Button) findViewById(R.id.btn_business);
        Button move_btn_entertainment = (Button) findViewById(R.id.btn_music);
        Button move_btn_general = (Button) findViewById(R.id.btn_general);
        Button move_btn_health = (Button) findViewById(R.id.btn_health);
        Button move_btn_science = (Button) findViewById(R.id.btn_science);
        Button move_btn_sports = (Button) findViewById(R.id.btn_sports);
        Button move_btn_technology = (Button) findViewById(R.id.btn_technology);


        settingDatModelList();



        //비즈니스 클릭 했을때
        move_btn_business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ArrayList<DataModel> businessDataModels = new ArrayList<DataModel>();

                //클릭시점에 여기로 온다.
                //DataModels 리스트를 돌면서 비즈니스 카테고리만 가져온다.
                for(int i = 0; i < DataModels.size(); i++) {

                    if (DataModels.get(i).gettv_category().equals("business")) {
                        //비즈니스 카테고리만 가져온다.
                        businessDataModels.add(DataModels.get(i));
                    }
                }

                //businessDataModels -> //비즈니스만 들어가있음.

                Intent intent = new Intent(MainActivity.this, SubActivity.class);

                //sub 엑티비티로 비즈니스 카테고리만 들어가있는 리스트를 넘긴다.
                intent.putExtra("DataModels", businessDataModels);
                startActivity(intent);
            }
        });



        //엔터테인먼트 클릭시
        move_btn_entertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });

        //일반 클릭시
        move_btn_general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });

        //건강 클릭시
        move_btn_health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });

        //과학 클릭시
        move_btn_science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });

        //스포츠 클릭시
        move_btn_sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });

        //기술 클릭시
        move_btn_technology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });


    }


    //데이터 모델리스트를 세팅 한다.
    private void settingDatModelList() {
        DataModels.add(new DataModel(R.drawable.ic_launcher_background, "title1", "content1", "writer1", 1, "business"));
        DataModels.add(new DataModel(R.drawable.akar_icons_music, "title2", "content2", "writer1", 1, "business"));
        DataModels.add(new DataModel(R.drawable.rectangle3, "title3", "content3", "writer1", 1, "entertainment"));
        DataModels.add(new DataModel(R.drawable.ic_launcher_background, "title4", "content4", "writer1", 1, "entertainment"));
        DataModels.add(new DataModel(R.drawable.ic_launcher_background, "title5", "content5", "writer1", 1, "entertainment"));
        DataModels.add(new DataModel(R.drawable.ic_launcher_background, "title6", "content6", "writer1", 1, "entertainment"));
        DataModels.add(new DataModel(R.drawable.ic_launcher_background, "title7", "content7", "writer1", 1, "business"));
        DataModels.add(new DataModel(R.drawable.rectangle3, "title8", "content8", "writer1", 1, "business"));
        DataModels.add(new DataModel(R.drawable.ic_launcher_background, "title9", "content9", "writer1", 1, "business"));
        DataModels.add(new DataModel(R.drawable.ic_launcher_background, "title10", "content10", "writer1", 1, "business"));
        DataModels.add(new DataModel(R.drawable.rectangle3, "title11", "content11", "writer1", 1, "business"));
        DataModels.add(new DataModel(R.drawable.ic_launcher_background, "title12", "content12", "writer1", 1, "entertainment"));
        DataModels.add(new DataModel(R.drawable.ic_launcher_background, "title13", "content13", "writer1", 1, "entertainment"));
        DataModels.add(new DataModel(R.drawable.rectangle3, "title14", "content14", "writer1", 1, "entertainment"));
        DataModels.add(new DataModel(R.drawable.rectangle3, "title15", "content15", "writer1", 1, "business"));
        DataModels.add(new DataModel(R.drawable.rectangle3, "title16", "content16", "writer1", 1, "entertainment"));
        DataModels.add(new DataModel(R.drawable.rectangle3, "title17", "content17", "writer1", 1, "business"));
    }
}