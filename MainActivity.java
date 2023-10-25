package com.example.beautyapple;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startCommonMakeUp(View v){
        Intent intent = new Intent(this, shading_the_main_color.class);
        startActivity(intent);
    }

    public void startChooseActivity(View v){
        Intent intent = new Intent(this, chooseOne.class);
        startActivity(intent);
    }


}