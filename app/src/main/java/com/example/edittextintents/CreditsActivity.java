package com.example.edittextintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CreditsActivity extends AppCompatActivity {

    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        answer=(TextView) findViewById(R.id.answer);
        Intent gi=getIntent();
        double ans=gi.getDoubleExtra("ans",0);
        answer.setText(""+ans);
    }
}