package com.example.td6;

import android.app.Application;

public class SearchRepoApplication extends Application {
private String search;

    @Override
    public void onCreate() {
        super.onCreate();
        this.search=null;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
