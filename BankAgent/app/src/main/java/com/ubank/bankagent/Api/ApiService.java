package com.ubank.bankagent.Api;

import com.ubank.bankagent.Model.BalanceList;
import com.ubank.bankagent.Model.Balance;

import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import com.ubank.bankagent.Model.Result;


public interface ApiService {

    @FormUrlEncoded
    @POST("login")
    Call<Result> userLogin(
            @Field("email") String email,
            @Field("password") String password
    );


    //The Balance Call
    @GET("bins/17qy68/")
    Call<BalanceList> getBalanceData();
    //https://api.myjson.com/bins/17qy68


    //The register call
    @FormUrlEncoded
    @POST("register")
    Call<Result> createUser(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password,
            @Field("gender") String gender);


    //@GET("User/listUser.html")
    //public Call<UserDTO> getUserByName(@Query("userName") String userNameValue);

    @GET("login/{username}/{password}")
    Call login(@Path("username") String username, @Path("password") String password);

    @POST("/loginsaya")
   // Call<ListFaqModel> postLogin(@Query("email") String username, @Query("password") String password);

    /**
     * URL MANIPULATION
     * @since Not used, Just to know how to use @query to get JSONObject
     * */
    @GET("bins/path/")
    Call<BalanceList> getBalanceDataData(@Query("company_no") int companyNo);



    /**
     * URL MANIPULATION
     * A request URL can be updated dynamically using replacement blocks and parameters on the method.
     * A replacement block is an alphanumeric string surrounded by { and }
     * A corresponding parameter must be annotated with @Path using the same string.
     * */
    @GET("group/{id}/users")
    Call<List<Balance>> groupList(@Path("id") int groupId);



    /**
     * URL MANIPULATION
     * Using Query parameters.
     * */
    @GET("group/{id}/users")
    Call<List<Balance>> groupList(@Path("id") int groupId, @Query("sort") String sort);




    /**
     * URL MANIPULATION
     * complex query parameter combinations a Map can be used
     * */
    @GET("group/{id}/balancelist")
    Call<List<Balance>> groupList(@Path("id") int groupId, @QueryMap Map<String, String> options);




    /**
     * URL MANIPULATION
     * HTTP request body with the @Body annotation
     */
    @POST("balance_activity/new")
    Call<Balance> createBalance(@Body Balance balance);




    /**
     * FORM ENCODED AND MULTIPART
     * Form-encoded data is sent when @FormUrlEncoded is present on the method.
     * Each key-value pair is annotated with @Field containing the name and the object providing the value
     * */
    @FormUrlEncoded
    @POST("balance_activity/edit")
    Call<Balance> updateBalance(@Field("id") String id, @Field("title") String title);




    /**
     * FORM ENCODED AND MULTIPART
     * Multipart requests are used when @Multipart is present on the method.
     * Parts are declared using the @Part annotation.
     * */
    @Multipart
    @PUT("balance_activity/photo")
    Call<Balance> updateBalance(@Part("photo") RequestBody photo, @Part("description") RequestBody description);




    /**
     * HEADER MANIPULATION
     * Set static headers for a method using the @Headers annotation.
     * */
    @Headers("Cache-Control: max-age=640000")
    @GET("balance_activity/list")
    Call<List<Balance>> BalanceList();



    /**
     * HEADER MANIPULATION
     * */
    @Headers({
            "Accept: application/vnd.github.v3.full+json",
            "User-Agent: Retrofit-Sample-App"
    })
    @GET("balancelist/{title}")
    Call<Balance> getBalance(@Path("title") String title);




    /**
     * HEADER MANIPULATION
     * A request Header can be updated dynamically using the @Header annotation.
     * A corresponding parameter must be provided to the @Header.
     * If the value is null, the header will be omitted. Otherwise, toString will be called on the value, and the result used.
     * */
    @GET("balance_activity")
    Call<Balance> getBalanceUsingHeader(@Header("Authorization") String authorization);

}