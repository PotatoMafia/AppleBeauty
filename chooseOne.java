package com.example.beautyapple;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class chooseOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_one);
    }

    public void startEveryDayMakeUp(View v){
        Intent intent = new Intent(this, EveryDay.class);
        startActivity(intent);
    }

    public void startEveningMakeUp(View v){
        Intent intent = new Intent(this, Evening.class);
        startActivity(intent);
    }

}