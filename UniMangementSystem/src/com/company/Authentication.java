package com.company;

public class Authentication {
    private String userName;
    private int password;

    public Authentication(String userName, int password) {
        this.userName = userName;
        this.password = password;
    }

    public Authentication() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
