package com.example.td4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        setTitle(getLocalClassName());
        TextView textView = (TextView) findViewById(R.id.textviewnews);
        NewsListApplication app = (NewsListApplication) getApplicationContext();
        textView.setText(app.getLogin());
        Button details = (Button) findViewById(R.id.detailsbtn);
        Button logout = (Button) findViewById(R.id.logoutbtn);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewsActivity.this, DetailsActivity.class);
                startActivity(intent);
            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewsActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}