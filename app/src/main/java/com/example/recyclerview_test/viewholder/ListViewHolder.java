package com.example.recyclerview_test.viewholder;

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
        background = itemView.findViewById(R.id.iv_apps_image);

        /*time = itemView.findViewById(R.id.)*/
    }

    public void onBind(DataModel dataModel) {
        title.setText(dataModel.gettv_title());
        writer.setText(dataModel.gettv_writer());
        time.setText(dataModel.gettv_time());
        content.setText(dataModel.gettv_content());

        int imageResourceId = dataModel.getImageResourceId();
        if (imageResourceId != 0) {
            background.setImageResource(imageResourceId);
        } else {
            background.setImageDrawable(null);
        }

    }
}
