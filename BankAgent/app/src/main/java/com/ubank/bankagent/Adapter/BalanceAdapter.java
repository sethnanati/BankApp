package com.ubank.bankagent.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ubank.bankagent.R;
import com.ubank.bankagent.Model.Balance;

import java.util.ArrayList;

public class BalanceAdapter extends RecyclerView.Adapter<BalanceAdapter.BalanceViewHolder> {

    private ArrayList<Balance> dataListBal;

    public BalanceAdapter(ArrayList<Balance> dataListBal) {
        this.dataListBal = dataListBal;
    }

    @Override
    public BalanceAdapter.BalanceViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.single_view_row, parent, false);
        return new BalanceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BalanceViewHolder holder, int position) {
        holder.txtNoticeTitle.setText(dataListBal.get(position).getTitle());
        holder.txtNoticeBrief.setText(dataListBal.get(position).getBrief());
        holder.txtNoticeFilePath.setText(dataListBal.get(position).getFileSource());
    }

    @Override
    public int getItemCount() {
        return dataListBal.size();

    }
    class BalanceViewHolder extends RecyclerView.ViewHolder {

        TextView txtNoticeTitle, txtNoticeBrief, txtNoticeFilePath;

        BalanceViewHolder(View itemView) {
            super(itemView);
            txtNoticeTitle =  itemView.findViewById(R.id.txt_notice_title);
            txtNoticeBrief =  itemView.findViewById(R.id.txt_notice_brief);
            txtNoticeFilePath =  itemView.findViewById(R.id.txt_notice_file_path);
        }
    }
}