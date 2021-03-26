package com.example.test;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import static android.widget.Toast.makeText;

public class adapter_class extends RecyclerView.Adapter<adapter_class.ViewHolder> {
    private LayoutInflater inflater;
    int[] imgview;
    Context cx;

    public adapter_class(Context context, int[] imgeV) {
        this.cx = context;
        inflater = LayoutInflater.from(cx);
        this.imgview = imgeV;

    }

    @NonNull
    public adapter_class.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.single, parent, false);
        return new adapter_class.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final adapter_class.ViewHolder holder, final int position) {
        String pos = String.valueOf(imgview[position]);
        holder.iv.setImageResource(Integer.parseInt(pos));
        holder.singleitem_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cx, fullscreen_activity.class);
                intent.putExtra("position", imgview[position]);
                cx.startActivity(intent);
                //Toast.makeText(cx, "item clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return imgview.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        ConstraintLayout singleitem_layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.imageView_single);
            singleitem_layout = itemView.findViewById(R.id.singlelayout);
        }
    }
}
