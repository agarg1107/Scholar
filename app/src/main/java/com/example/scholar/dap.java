package com.example.scholar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class dap extends RecyclerView.Adapter<dap.viewholder>{
    ArrayList<String> collagelist;
    ArrayList<String> pack;
    Context context;

    public dap(ArrayList<String> collagelist, ArrayList<String> pack, Context context) {
        this.collagelist = collagelist;
        this.pack = pack;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        holder.textView.setText(collagelist.get(position));
        holder.textView2.setText(pack.get(position));

    }

    @Override
    public int getItemCount() {
        return collagelist.size();
    }

    public class viewholder extends RecyclerView.ViewHolder
    {
        TextView textView;
        TextView textView2;

        public viewholder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.name);
            textView2 = itemView.findViewById(R.id.pack);
        }
    }
}
