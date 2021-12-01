package com.example.td6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class serchrepos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serchrepos);
        Button searchButton= (Button) findViewById(R.id.search_button);
        EditText editText=(EditText) findViewById(R.id.editText);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),MainActivity.class);
                SearchRepoApplication searchRepoApplication=(SearchRepoApplication) getApplicationContext();
                searchRepoApplication.setSearch(editText.getText().toString());
                startActivity(intent);
            }
        });

    }
}