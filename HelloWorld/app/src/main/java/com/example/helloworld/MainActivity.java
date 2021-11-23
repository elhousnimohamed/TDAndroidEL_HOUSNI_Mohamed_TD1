package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String TAG="Hello";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String text= "Bonjour EL HOUSNI";
        Log.i(TAG,text);
        Integer v =54;
        Integer n=v/9 -2;
        Log.i(TAG,"n= "+n);
        Integer f=factorielle(n);
        Log.i(TAG,f.toString()+"! = "+f);
    }
    private int factorielle(int n)
    {
        Integer r;
        if(n>1)
        {
            int fnm1=factorielle(n-1);
            r=n*fnm1;
        }
        else
        {
            r=1;
        }
        return r;
    }
}