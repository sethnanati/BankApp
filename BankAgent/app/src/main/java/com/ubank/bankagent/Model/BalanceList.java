package com.ubank.bankagent.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class BalanceList {
    @SerializedName("balance_list")
    private ArrayList<Balance> balanceList;

    public ArrayList<Balance> getBalanceArrayList() {
        return balanceList;
    }

    public void setBalanceArrayList(ArrayList<Balance> balanceArrayList) {
        this.balanceList = balanceArrayList;
    }
}
