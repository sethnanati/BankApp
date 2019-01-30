package com.ubank.bankagent.Model;

import com.google.gson.annotations.SerializedName;

public class Result {

//    private String phone;
//    private String email;
//    private String bvn;
//    private String firstname;
//    private String surname;
//    private String date_of_birth;
//    private String place_of_birth;
//    private String gender;
//    private String sorigin;
//    private String mother_maiden_name;
//    private String lga;
//    private String house_no;
//    private String tin;
//    private String house_address;
//    private String house_address_1;
//    private String religion;
//    private String house_landmark;
//    private String mailing_address;
//    private String mailing_address_2;
//    private String house_state;

        @SerializedName("error")
        private Boolean error;

        @SerializedName("message")
        private String message;

        @SerializedName("User")
        private User user;

        public Result(Boolean error, String message, User user) {
            this.error = error;
            this.message = message;
            this.user = user;
        }

        public Boolean getError() {
            return error;
        }

        public String getMessage() {
            return message;
        }

        public User getUser() {
            return user;
        }
}
