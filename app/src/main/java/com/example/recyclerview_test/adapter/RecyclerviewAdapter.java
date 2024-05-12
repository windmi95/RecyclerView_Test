package com.example.recyclerview_test.adapter;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;


import com.example.recyclerview_test.R;
import com.example.recyclerview_test.data.DataModel;
import com.example.recyclerview_test.viewholder.ListViewHolder;

import java.util.ArrayList;

public class RecyclerviewAdapter extends RecyclerView.Adapter<ListViewHolder> {

    private ArrayList<DataModel> DatamModelList;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.subactivity,
                parent,
                false
        );
        ListViewHolder viewHolder = new ListViewHolder(view);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = getAdapterPosition();
                if (listener != null && position != RecyclerView.NO_POSITION) {
                    listener.onItemClick(position);
                }
            }
        });
        return viewHolder;
    }

    private int getAdapterPosition() {
        return 0;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        holder.onBind(DatamModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return DatamModelList.size();
    }

    public void setDatamModelList(ArrayList<DataModel> datamModelList) {
        this.DatamModelList = DatamModelList;
        notifyDataSetChanged();
    }
}
