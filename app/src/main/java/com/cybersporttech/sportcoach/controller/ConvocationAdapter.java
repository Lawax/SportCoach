package com.cybersporttech.sportcoach.controller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cybersporttech.sportcoach.R;
import com.cybersporttech.sportcoach.model.Convoc.Convocation;

import java.util.List;

public class ConvocationAdapter extends RecyclerView.Adapter<ConvocationAdapter.ConvocationViewHolder> {

    private android.content.Context mCtx;
    private List<Convocation> convocationList ;

    public ConvocationAdapter(Context mCtx, List <Convocation> convocationList ){
        this.mCtx= mCtx;
        this.convocationList = convocationList;
    }


    @NonNull
    @Override
    public ConvocationAdapter.ConvocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ConvocationViewHolder (LayoutInflater.from(mCtx).inflate(R.layout.activity_convocation, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ConvocationViewHolder holder, int position) {
        Convocation convocation = convocationList.get(position);

        holder.textViewClub.setText(convocation.getClub());
        holder.textViewCategorie.setText(convocation.getCategorie());
        holder.textViewLieu.setText(convocation.getLieu());
        holder.textViewDate.setText(convocation.getDate());
        holder.textViewListjoueurs.setText(convocation.getListjoueurs());

    }
    @Override
    public int getItemCount() {
        return convocationList .size();
    }

    class ConvocationViewHolder extends RecyclerView.ViewHolder {

        TextView textViewClub, textViewCategorie, textViewLieu, textViewDate, textViewListjoueurs;

        public ConvocationViewHolder(View itemView) {
            super(itemView);

            textViewClub = itemView.findViewById(R.id.nomduClub_txt);
            textViewCategorie = itemView.findViewById(R.id.categories_txt);
            textViewLieu = itemView.findViewById(R.id.lieu_txt);
            textViewDate = itemView.findViewById(R.id.date_txt);
            textViewListjoueurs = itemView.findViewById(R.id.ListeJoueurs_txt);

        }

    }
}
