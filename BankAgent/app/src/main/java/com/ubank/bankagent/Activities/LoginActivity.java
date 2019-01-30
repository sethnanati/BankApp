package com.ubank.bankagent.Activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ubank.bankagent.Api.ApiService;
import com.ubank.bankagent.Model.ResObj;
import com.ubank.bankagent.R;
import com.ubank.bankagent.network.ApiUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class LoginActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonSignIn;
    ApiService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        buttonSignIn = (Button) findViewById(R.id.buttonSignIn);
       // buttonSignIn.setOnClickListener(this);

       // editTextEmail = (EditText) findViewById(R.id.user_name);
       // editTextPassword = (EditText) findViewById(R.id.user_pass);
       // buttonSignIn = (Button) findViewById(R.id.buttonSignIn);
       // userService = ApiUtils.getUserService();

    }

//    private void userSignIn() {
//        final ProgressDialog progressDialog = new ProgressDialog(this);
//        progressDialog.setMessage("Signing Up...");
//        progressDialog.show();
//
//        String email = editTextEmail.getText().toString().trim();
//        String password = editTextPassword.getText().toString().trim();
//
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(APIUrl.BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        APIService service = retrofit.create(APIService.class);
//
//
//        Call<Result> call = service.userLogin(email, password);
//
//        call.enqueue(new Callback<Result>() {
//            @Override
//            public void onResponse(Call<Result> call, Response<Result> response) {
//                progressDialog.dismiss();
//                if (!response.body().getError()) {
//                    finish();
//                    SharedPrefManager.getInstance(getApplicationContext()).userLogin(response.body().getUser());
//                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
//                } else {
//                    Toast.makeText(getApplicationContext(), "Invalid email or password", Toast.LENGTH_LONG).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Result> call, Throwable t) {
//                progressDialog.dismiss();
//                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
//            }
//        });
//    }
//
//    @Override
//    public void onClick(View view) {
//        if (view == buttonSignIn) {
//            userSignIn();
//        }
 //   }



//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String username = edtUsername.getText().toString();
//                String password = edtPassword.getText().toString();
//                //validate form
//                if(validateLogin(username, password)){
//                    //do login
//                    doLogin(username, password);
//                }
//            }
//        });
//
//    }
//
//    private boolean validateLogin(String username, String password){
//        if(username == null || username.trim().length() == 0){
//            Toast.makeText(this, "Username is required", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        if(password == null || password.trim().length() == 0){
//            Toast.makeText(this, "Password is required", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        return true;
//    }
//
//    private void doLogin(final String username,final String password){
//        Call call = userService.login(username,password);
//        call.enqueue(new Callback() {
//            @Override
//            public void onResponse(Call call, Response response) {
//                if(response.isSuccessful()){
//                    ResObj resObj = (ResObj) response.body();
//                    if(resObj.getMessage().equals("true")){
//                        //login start main activity
//                        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                        intent.putExtra("username", username);
//                        startActivity(intent);
//
//                    } else {
//                        Toast.makeText(LoginActivity.this, "The username or password is incorrect", Toast.LENGTH_SHORT).show();
//                    }
//                } else {
//                    Toast.makeText(LoginActivity.this, "Error! Please try again!", Toast.LENGTH_SHORT).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call call, Throwable t) {
//                Toast.makeText(LoginActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });
//    }

}
