package com.austinegwa64.myrevisionapp.Models;

/**
 * Created by gwaza on 3/26/2018.
 */

public class User {

        String nickname;
        String profileUrl;
        String UserId;

    public User() {
    }

    public User(String nickname, String profileUrl, String UserId) {
        this.nickname = nickname;
        this.profileUrl = profileUrl;
        this.UserId = UserId;
    }

    public String getNickname() {
        return nickname;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }
}
