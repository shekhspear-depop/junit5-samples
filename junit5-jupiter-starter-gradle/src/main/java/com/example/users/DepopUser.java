package com.example.users;

public class DepopUser {

    static final String userCreateEndpoint = "/api/v1/users/";
    private String internalUserEndpoint;

    public DepopUser() {
        this.internalUserEndpoint = userCreateEndpoint;
    }


    public String getInternalEndpoint() {
        return internalUserEndpoint;
    }
}
