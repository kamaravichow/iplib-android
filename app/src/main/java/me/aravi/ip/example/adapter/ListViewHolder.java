package me.aravi.ip.example.adapter;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import me.aravi.ip.example.databinding.ItemListBinding;

public class ListViewHolder extends RecyclerView.ViewHolder {
    public TextView title, content;

    public ListViewHolder(@NonNull ItemListBinding binding) {
        super(binding.getRoot());
        title = binding.title;
        content = binding.content;
    }
}
