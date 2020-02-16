package com.example.aidsawarness.Admin;


import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.aidsawarness.R;

public class TextItemViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;


    public TextItemViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.list_item);
    }

    public void bind(String text) {
        textView.setText(text);
    }

}
