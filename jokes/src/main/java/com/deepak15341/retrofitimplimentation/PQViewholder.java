package com.deepak15341.retrofitimplimentation;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PQViewholder extends RecyclerView.ViewHolder {

    private TextView txtPQ,txtPQA;

    public PQViewholder(@NonNull View itemView) {
        super(itemView);
        txtPQ = itemView.findViewById(R.id.txtPQ);
        txtPQA =itemView.findViewById(R.id.txtPQA);
    }

    public TextView getTxtPQ() {
        return txtPQ;
    }

    public void setTxtPQ(TextView txtPQ) {
        this.txtPQ = txtPQ;
    }

    public TextView getTxtPQA() {
        return txtPQA;
    }

    public void setTxtPQA(TextView txtPQA) {
        this.txtPQA = txtPQA;
    }
}
