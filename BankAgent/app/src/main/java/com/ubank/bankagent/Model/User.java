package com.ubank.bankagent.Model;

public class User {
    private int id;
    private String phone;
    private String email;
    private String bvn;
    private String firstname;
    private String surname;
    private String date_of_birth;
    private String place_of_birth;
    private String gender;
    private String sorigin;
    private String mother_maiden_name;
    private String lga;
    private String house_no;
    private String tin;
    private String house_address;
    private String house_address_1;
    private String religion;
    private String house_landmark;
    private String mailing_address;
    private String mailing_address_2;
    private String house_state;
    private String name;
    private String password;

    public User(String name, String email, String password, String gender) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public User(int id, String name, String email, String gender){
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public User(int id, String name, String email, String password, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getGender() {
        return gender;
    }
}
