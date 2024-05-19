package com.example.recyclerview_test.activity;

import androidx.appcompat.app.AppCompatActivity;

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

                //클릭 시점에 여기로 온다.
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
                ArrayList<DataModel> entertainmentDataModels = new ArrayList<DataModel>();

                //클릭 시점에 여기로 온다.
                //DataModels 리스트를 돌면서 entertainment 카테고리만 가져온다.
                for(int i = 0; i < DataModels.size(); i++) {

                    if (DataModels.get(i).gettv_category().equals("entertainment")) {
                        //entertainment 카테고리만 가져온다.
                        entertainmentDataModels.add(DataModels.get(i));
                    }
                }

                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                //sub 엑티비티로 entertainment 카테고리만 들어가있는 리스트를 넘긴다.
                intent.putExtra("DataModels", entertainmentDataModels);
                startActivity(intent);

            }
        });

        //일반 클릭시
        move_btn_general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<DataModel> generalDataModels = new ArrayList<DataModel>();

                //클릭 시점에 여기로 온다.
                //DataModels 리스트를 돌면서 general 카테고리만 가져온다.

                for(int i = 0; i < DataModels.size(); i++) {

                    if (DataModels.get(i).gettv_category().equals("general")) {
                        //general 카테고리만 가져온다.
                       generalDataModels.add(DataModels.get(i));
                    }
                }

                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                //sub 엑티비티로 entertainment 카테고리만 들어가있는 리스트를 넘긴다.
                intent.putExtra("DataModels", generalDataModels);
                startActivity(intent);
            }
        });

        //건강 클릭시
        move_btn_health.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ArrayList<DataModel> healthDataModels = new ArrayList<DataModel>();

                //클릭 시점에 여기로 온다.
                //DataModels 리스트를 돌면서 health 카테고리만 가져온다.

                for(int i = 0; i < DataModels.size(); i++) {

                    if (DataModels.get(i).gettv_category().equals("health")) {
                        //health 카테고리만 가져온다.
                        healthDataModels.add(DataModels.get(i));
                    }
                }

                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                //sub 엑티비티로 health 카테고리만 들어가있는 리스트를 넘긴다.
                intent.putExtra("DataModels", healthDataModels);
                startActivity(intent);
            }
        });

        //과학 클릭시
        move_btn_science.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ArrayList<DataModel> scienceDataModels = new ArrayList<DataModel>();

                //클릭 시점에 여기로 온다.
                //DataModels 리스트를 돌면서 science 카테고리만 가져온다.

                for(int i = 0; i < DataModels.size(); i++) {

                    if (DataModels.get(i).gettv_category().equals("science")) {
                        //science 카테고리만 가져온다.
                        scienceDataModels.add(DataModels.get(i));
                    }
                }

                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                //sub 엑티비티로 science 카테고리만 들어가있는 리스트를 넘긴다.
                intent.putExtra("DataModels", scienceDataModels);
                startActivity(intent);
            }
        });

        //스포츠 클릭시
        move_btn_sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<DataModel> sportsDataModels = new ArrayList<DataModel>();

                //클릭 시점에 여기로 온다.
                //DataModels 리스트를 돌면서 sports 카테고리만 가져온다.

                for(int i = 0; i < DataModels.size(); i++) {

                    if (DataModels.get(i).gettv_category().equals("sports")) {
                        //sports 카테고리만 가져온다.
                        sportsDataModels.add(DataModels.get(i));
                    }
                }


                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                //sub 엑티비티로 sports 카테고리만 들어가있는 리스트를 넘긴다.
                intent.putExtra("DataModels", sportsDataModels);
                startActivity(intent);
            }
        });

        //기술 클릭시
        move_btn_technology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<DataModel> technologyDataModels = new ArrayList<DataModel>();

                //클릭 시점에 여기로 온다.
                //DataModels 리스트를 돌면서 technology 카테고리만 가져온다.

                for(int i = 0; i < DataModels.size(); i++) {

                    if (DataModels.get(i).gettv_category().equals("technology")) {
                        //technology 카테고리만 가져온다.
                        technologyDataModels.add(DataModels.get(i));
                    }
                }

                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                //sub 엑티비티로 technology 카테고리만 들어가있는 리스트를 넘긴다.
                intent.putExtra("DataModels", technologyDataModels);
                startActivity(intent);
            }
        });


    }


    //데이터 모델리스트를 세팅 한다.
    private void settingDatModelList() {
        DataModels.add(new DataModel(R.drawable.rectangle, "10 of the Cheapest and Healthiest Ways to Feed a Group, According to Reddit...", "asfdasdfasf", "Pedro Berrill", "3 hours ago", "business"));
        DataModels.add(new DataModel(R.drawable.rectangle2, "Nasa set to announce plans to return samples from Mars back to Earth", "content2", "Anna Dietz", "11 hours ago", "science"));
        DataModels.add(new DataModel(R.drawable.rectangle3, "Photo proves US star is a cheat code as world record obliterated - Fox Sports", "content3", "Pedro Berrill", "3 hours ago", "sports"));
        DataModels.add(new DataModel(R.drawable.haedal, "도구 사용하는 해달, 더 큰 먹이 먹고 이빨 손상 적다", "content4", "박정연", "2 hours ago", "science"));
        DataModels.add(new DataModel(R.drawable.egg, "달걀 매일 먹지만, 이제껏 몰랐다... 더 신선하고 건강하게 먹는 방법", "content5", "코메디닷컴", "5 hours ago", "health"));
        DataModels.add(new DataModel(R.drawable.criminal, "뺑소니 혐의' 김호중, 의혹 5일만 첫 심경 \"모든 죄·상처는 내가…", "content6", "김선우", "6 hours ago", "entertainment"));
        DataModels.add(new DataModel(R.drawable.market, "우리집은 보통가구일까? 월 544만원 벌어야 '보통가구'", "content7", "한경", "7 hours ago", "general"));
        DataModels.add(new DataModel(R.drawable.education, "학교밖청소년·북한이탈주민 17만명, 무료로 '강남인강' 듣는다", "content8", "최윤선", "8 hours ago", "general"));
        DataModels.add(new DataModel(R.drawable.manchester, "맨체스터 유나이티드 새 구단주가 최우선 영입 대상으로 정했다...최전방 스트라이커 자리 강화 위해 1030억 제안 예정", "content9", "이성민", "9 hours ago", "sports"));
        DataModels.add(new DataModel(R.drawable.chatbot, "인공지능 챗봇에 알려주는 정보 믿어도 될까", "content10", "유용화", "10 hours ago", "science"));
        DataModels.add(new DataModel(R.drawable.karina, "카리나 “SM 노래, 이상한 가사 많아” 돌직구→레드벨벳 받쓰 성공 (‘놀토’)", "content11", "박하영", "11 hours ago", "entertainment"));
        DataModels.add(new DataModel(R.drawable.phone, "아이폰 더 얇아진다…\"최상급 `프로맥스`보다 비쌀 듯\"", "content12", "김나인", "12 hours ago", "technology"));
        DataModels.add(new DataModel(R.drawable.business, "1", "casfdsafsadf", "조민규", "13 hours ago", "business"));
        DataModels.add(new DataModel(R.drawable.guiness, "튀르키예 언론 \"귀네슈, 한국 대표팀 부임\"…정해성 위원장은 \"오보\"라며 선 그어", "content14", "강종훈", "14 hours ago", "sports"));
        DataModels.add(new DataModel(R.drawable.singa, "주 4일제 첫걸음 뗐다\"…亞 최초 도입 속도 내는 이 나라", "content15", "아시아 경제", "15 hours ago", "business"));
        DataModels.add(new DataModel(R.drawable.coco, "이것으로 수분 채운다? 물 대신 마시기 좋은 음료 4가지", "content16", "헬스조선", "16 hours ago", "health"));
        DataModels.add(new DataModel(R.drawable.recycling, "'SMART 축산을 꿈꾸다' 4) R(자원재활용, Recycling), 5) T(첨단기술, Technology)", "content17", "홍정민", "17 hours ago", "technology"));
    }
}