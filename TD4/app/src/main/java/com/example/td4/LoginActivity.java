package com.example.td4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle(getLocalClassName());
        Button button = (Button) findViewById(R.id.button);
        EditText editText = (EditText) findViewById(R.id.login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, NewsActivity.class);
                NewsListApplication app = (NewsListApplication) getApplicationContext();
                app.setLogin(editText.getText().toString());
                startActivity(intent);
                finish();
            }
        });


    }
}