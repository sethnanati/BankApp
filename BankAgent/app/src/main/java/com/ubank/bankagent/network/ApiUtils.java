package com.ubank.bankagent.network;

import com.ubank.bankagent.Api.ApiService;

public class ApiUtils {
    public static final String BASE_URL = "http://192.168.20.110/demo/";

    public static ApiService getUserService(){
        return RetrofitInstance.getRetrofitInstance(BASE_URL).create(ApiService.class);
    }
}
