package com.example.recylcerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.WisataViewHolder> {
    private ArrayList<Wisata> datalist;

    public WisataAdapter(ArrayList<Wisata> datalist) {
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public WisataAdapter.WisataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_row,parent,false);
        return new WisataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WisataViewHolder holder, int position) {
        holder.judul.setText(datalist.get(position).getNama());
        holder.desc.setText(datalist.get(position).getDeskripsi());
        Glide.with(holder.itemView)
                .load(datalist.get(position).getPhoto())
                .apply(new RequestOptions().override(120,120))
                .into(holder.img);
    }

    @Override
    public int getItemCount() {
        return (datalist != null )? datalist.size() : 0;
    }

    public class WisataViewHolder extends RecyclerView.ViewHolder {
        TextView judul;
        TextView desc;
        ImageView img;

        public WisataViewHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.tvJudul);
             desc = itemView.findViewById(R.id.tvDesc);
             img = itemView.findViewById(R.id.imgWisata);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return position ;

    }


}
