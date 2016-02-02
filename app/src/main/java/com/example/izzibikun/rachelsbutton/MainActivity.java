package com.example.izzibikun.rachelsbutton;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.izzibikun.rachelsbutton.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        Resources res = getResources();
        String[] messages = res.getStringArray(R.array.affirmation);
        Random myRandom = new Random();
        String output = messages[myRandom.nextInt(4)];
        intent.putExtra(EXTRA_MESSAGE, output);
        startActivity(intent);
    }
}
