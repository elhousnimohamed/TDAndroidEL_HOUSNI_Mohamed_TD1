package com.example.td4;

import android.app.Application;

public class NewsListApplication extends Application {
    private String login;

    @Override
    public void onCreate() {
        super.onCreate();
        this.login = null;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
