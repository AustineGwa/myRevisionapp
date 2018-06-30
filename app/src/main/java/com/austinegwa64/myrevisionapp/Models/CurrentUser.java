package com.austinegwa64.myrevisionapp.Models;

/**
 * Created by gwaza on 3/26/2018.
 */

public class CurrentUser {

    String UserId;

    public CurrentUser() {
    }

    public CurrentUser(String userId) {
        UserId = userId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
}
