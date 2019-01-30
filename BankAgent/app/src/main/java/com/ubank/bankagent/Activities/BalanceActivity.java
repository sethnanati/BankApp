package com.ubank.bankagent.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.ubank.bankagent.Adapter.BalanceAdapter;
import com.ubank.bankagent.Api.ApiService;
import com.ubank.bankagent.Model.BalanceList;
import com.ubank.bankagent.Model.Balance;
import com.ubank.bankagent.R;
import com.ubank.bankagent.network.RetrofitInstance;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.ubank.bankagent.network.RetrofitInstance.BASE_URL;


/**
 * Created by intel on 6/2/2016.
 */
public class BalanceActivity extends BaseActivity {

    private RecyclerView recyclerView;
    private BalanceAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout contentFrameLayout = (FrameLayout) findViewById(R.id.content_frame); //Remember this is the FrameLayout area within your activity_main.xml
        getLayoutInflater().inflate(R.layout.balance_activity, contentFrameLayout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.getMenu().getItem(1).setChecked(true);

        /** Create handle for the RetrofitInstance interface*/
        ApiService service = RetrofitInstance.getRetrofitInstance(BASE_URL).create(ApiService.class);

        /** Call the method with parameter in the interface to get the notice data*/
        Call<BalanceList> call = service.getBalanceData();

        /**Log the URL called*/
        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<BalanceList>() {
            @Override
            public void onResponse(Call<BalanceList> call, Response<BalanceList> response) {
                generateBalanceList(response.body().getBalanceArrayList());
            }

            @Override
            public void onFailure(Call<BalanceList> call, Throwable t) {
                Toast.makeText(BalanceActivity.this, "Something went wrong...Error message: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    /** Method to generate List of notice using RecyclerView with custom adapter*/
    private void generateBalanceList(ArrayList<Balance> balanceArrayList) {
        recyclerView = findViewById(R.id.recycler_view_balance_list);
        adapter = new BalanceAdapter(balanceArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(BalanceActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }


}

