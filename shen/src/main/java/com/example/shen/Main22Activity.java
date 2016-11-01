package com.example.shen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class Main22Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);




        SeekCircle seekCircle = (SeekCircle)findViewById(R.id.seekCircle);
        seekCircle.setOnSeekCircleChangeListener(new SeekCircle.OnSeekCircleChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekCircle seekCircle)
            {}

            @Override
            public void onStartTrackingTouch(SeekCircle seekCircle)
            {}

            @Override
            public void onProgressChanged(SeekCircle seekCircle, int progress, boolean fromUser)
            {
                updateText();
            }
        });

        updateText();
    }


    private void updateText()
    {
        SeekCircle seekCircle = (SeekCircle)findViewById(R.id.seekCircle);
        TextView textProgress = (TextView)findViewById(R.id.textProgress);

        if (textProgress != null && seekCircle != null)
        {
            int progress = seekCircle.getProgress();
            textProgress.setText(Integer.toString(progress) + "%");
        }
    }
}
