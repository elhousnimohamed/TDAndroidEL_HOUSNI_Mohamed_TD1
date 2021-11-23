package com.example.td4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        setTitle(getLocalClassName());
        TextView textViewdetails=(TextView) findViewById(R.id.textviewdetails);
        NewsListApplication app = (NewsListApplication) getApplicationContext();
        textViewdetails.setText(app.getLogin());
        Button Googlelink = (Button) findViewById(R.id.Googlelink);
        Googlelink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://news.google.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}