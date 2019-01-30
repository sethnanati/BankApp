package com.ubank.bankagent.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static Retrofit retrofit;
    public static final String BASE_URL = "https://api.myjson.com/";
    //private static final String BASE_URL = "http://192.168.20.110/demo/";

    /**
     * Create an instance of Retrofit object
     *
     * @param baseUrl*/
    public static Retrofit getRetrofitInstance(String baseUrl) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}