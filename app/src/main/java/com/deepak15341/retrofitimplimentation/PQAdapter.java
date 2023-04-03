package com.deepak15341.retrofitimplimentation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PQAdapter extends RecyclerView.Adapter<PQViewholder> {

    private  Context mContext;
    private List<Quotemodal> mQuotemodal;
    public PQAdapter(Context context, List<Quotemodal> quotemodalList){

        mContext =context;
        mQuotemodal = quotemodalList;

    }

    @NonNull
    @Override
    public PQViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview,parent,false);
        return new PQViewholder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PQViewholder holder, int position) {
        Quotemodal quotemodal = mQuotemodal.get(position);
        holder.getTxtPQ().setText(quotemodal.getEn());
        holder.getTxtPQA().setText(quotemodal.getAuthor());

    }

    @Override
    public int getItemCount() {
        return mQuotemodal.size();
    }
}
