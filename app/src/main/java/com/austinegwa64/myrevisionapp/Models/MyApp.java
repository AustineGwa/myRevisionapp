package com.austinegwa64.myrevisionapp.Models;

/**
 * Created by gwaza on 3/26/2018.
 */

public class MyApp {
    static CurrentUser currentUser;

    public MyApp(CurrentUser currentUser) {
        this.currentUser = currentUser;
    }

    public MyApp() {
    }

    public static CurrentUser getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(CurrentUser currentUser) {
        this.currentUser = currentUser;
    }
}
