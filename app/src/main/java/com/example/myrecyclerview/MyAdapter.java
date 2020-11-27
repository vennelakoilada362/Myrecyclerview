package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.Myviewholder> {
Context ctx;
String tittle[];
String subtittle[];
int images[];

    public MyAdapter(Context ctx, String[] tittle, String[] subtittle, int[] images) {
        this.ctx = ctx;
        this.tittle = tittle;
        this.subtittle = subtittle;
        this.images = images;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Myviewholder(LayoutInflater.from(ctx).inflate(R.layout.everyrow,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
holder.img.setImageResource(images[position]);
holder.txt1.setText(tittle[position]);
        holder.txt2.setText(subtittle[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class Myviewholder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt1,txt2;
        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img1);
            txt1 = itemView.findViewById(R.id.tittle1);
            txt2 = itemView.findViewById(R.id.subtittle);
        }
    }
}
