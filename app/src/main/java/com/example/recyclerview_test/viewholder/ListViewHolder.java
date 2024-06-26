package com.example.recyclerview_test.viewholder;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_test.R;
import com.example.recyclerview_test.data.DataModel;

public class ListViewHolder extends RecyclerView.ViewHolder {
    TextView title;
    ImageView background;

    TextView writer;

    TextView time;

    TextView content;

    ConstraintLayout constraintLayout;


    public ListViewHolder(@NonNull View itemView) {
        super(itemView);
        background = itemView.findViewById(R.id.iv_first_apps_image);
        title = itemView.findViewById(R.id.tv_headline);
        writer = itemView.findViewById(R.id.tv_first_writer);
        time = itemView.findViewById(R.id.tv_first_article_time);
        constraintLayout = itemView.findViewById(R.id.cl_first_article);

    }

    public void onBind(DataModel dataModel) {
        title.setText(dataModel.gettv_title());
        writer.setText(dataModel.gettv_writer());
        time.setText(dataModel.gettv_time());

        Log.v("title","titlename: "+dataModel.gettv_title());
        Log.v("time","timeOut:"+dataModel.gettv_time());
        Log.v("ListViewHolder", "Title: " + dataModel.gettv_title() + ", Writer: " + dataModel.gettv_writer() + ", Time: " + dataModel.gettv_time());


        int imageResourceId = dataModel.getiv_background();
        if (imageResourceId != 0) {
            background.setImageResource(imageResourceId);
        } else {
            background.setImageDrawable(null);
        }

    }
}
