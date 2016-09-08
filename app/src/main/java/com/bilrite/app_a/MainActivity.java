package com.bilrite.app_a;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClickOne(View view) {

        Intent intent = new Intent(this,ActivityOne.class);
        startActivity(intent);
    }
    public void buttonClickTwo(View view) {

        Intent intent = new Intent(this,ActivityTwo.class);
        startActivity(intent);

}}
