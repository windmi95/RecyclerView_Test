package com.example.recyclerview_test.data;

public class DataModel {


    private int iv_background;
    private String tv_title;
    private String tv_content;

    private String tv_writer;
    private int tv_time;
    private String tv_category;

    public DataModel(int iv_background, String tv_title, String tv_content) {
        this.iv_background = iv_background;
        this.tv_title = tv_title;
        this.tv_content = tv_content;

    }

    public int getiv_background() {
        return iv_background;
    }

    public void setiv_background(int iv_background) {
        this.iv_background = iv_background;
    }

    public String gettv_title() {
        return tv_title;
    }

    public void settv_title(String tv_title) {
        this.tv_title = tv_title;
    }

    public String gettv_content() {
        return tv_content;
    }
    public void settv_content(String tv_content) {
        this.tv_content = tv_content;
    }

    public String gettv_writer() {
        return tv_writer;
    }

    public void settv_writer(String tv_writertv) {
        this.tv_writer = tv_writer;
    }

    public String gettv_category() {
        return tv_category;
    }

    public void settv_category(String tv_category) {
        this.tv_category = tv_category;
    }


    public int gettv_time() {
        return tv_time;
    }

    public void settv_time(int tv_time) {
        this.tv_time = tv_time;
    }

}
