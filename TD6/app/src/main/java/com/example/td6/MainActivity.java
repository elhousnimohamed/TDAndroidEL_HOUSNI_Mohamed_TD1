package com.example.td6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    List<Repo> repoList=new ArrayList<Repo>();
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repo);
        SearchRepoApplication searchRepoApplication= (SearchRepoApplication) getApplicationContext();
        RecyclerView rvContacts=(RecyclerView) findViewById(R.id.rvContacts);
        context=this;
        GithubService githubService=new Retrofit.Builder().baseUrl(GithubService.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GithubService.class);

        githubService.listRepo("adrienbusin").enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                repoList=response.body();
                ReposAdapter adapter=new ReposAdapter(repoList);
                rvContacts.setAdapter(adapter);
                rvContacts.setLayoutManager(new LinearLayoutManager(context));

            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                t.getCause();
            }
        });
    }

}