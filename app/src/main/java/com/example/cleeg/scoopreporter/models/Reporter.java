package com.example.cleeg.scoopreporter.models;

public class Reporter {

    private Integer mCred;
    private String mUsername;
    private String mEmail;

    public Reporter() {
        // Default constructor required for calls to DataSnapshot.getValue(Reporter.class)
    }

    public Reporter(Integer cred, String username, String email) {
        mCred = cred;
        mUsername = username;
        mEmail = email;
    }

    public Integer getCred() { return mCred; }
    public String getUsername() { return mUsername; }
    public String getEmail() {return mEmail; }

}
