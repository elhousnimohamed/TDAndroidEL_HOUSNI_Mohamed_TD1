package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton = (Button) findViewById(R.id.btn);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        TextView textView3 = (TextView) findViewById(R.id.textView3);
        EditText editText=(EditText) findViewById(R.id.edittext);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value=Integer.parseInt(editText.getText().toString());
                    textView2.setText(Integer.toString((int) Math.floor(Math.random()*value+1)));
                    textView3.setText(Integer.toString((int) Math.floor(Math.random()*value+1)));
            }
        });
    }
}