package me.aravi.ip.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import me.aravi.ip.example.ListItem;
import me.aravi.ip.example.databinding.ItemListBinding;

public class ListAdapter extends RecyclerView.Adapter<ListViewHolder> {
    private Context context;
    private List<ListItem> listItems;

    public ListAdapter(Context context, List<ListItem> listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemListBinding binding = ItemListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ListViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        ListItem item = listItems.get(position);
        holder.title.setText(item.getTitle());
        holder.content.setText(item.getContent());
    }

    @Override
    public int getItemCount() {
        if (listItems == null) return 0;
        return listItems.size();
    }
}
