package com.example.oop4;

import org.json.simple.JSONObject;

public class Users {
    private String name;
    private String lastname;
    private int age;
    private String email;
    private String telegram;
    private String mobile;

    public Users(String name, String lastname, int age, String email, String telegram, String mobile) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.telegram = telegram;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getTelegram() {
        return telegram;
    }
    public String getMobile() {
        return mobile;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public JSONObject toJSON() {
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("lastname", lastname);
        json.put("age", age);
        json.put("email", email);
        json.put("telegram", telegram);
        json.put("mobile", mobile);
        return json;
    }

    public static Users fromJSON(JSONObject json) {
        try {
            String name = (String) json.get("name");
            String lastname = (String) json.get("lastname");
            int age = ((Long) json.get("age")).intValue();
            String email = (String) json.get("email");
            String telegram = (String) json.get("telegram");
            String mobile = (String) json.get("mobile");

            return new Users(name, lastname, age, email, telegram, mobile);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
