package com.example.shen;

import android.os.RemoteCallbackList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.RelativeLayout;

public class Main2Activity extends AppCompatActivity {
    private View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        RelativeLayout root=(RelativeLayout)findViewById(R.id.root);

        final  DrawView drawView=new DrawView(this);
        drawView.setMinimumWidth(10);
        drawView.setMinimumHeight(10);
        root.addView(drawView);
    }
}
