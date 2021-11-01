package ru.shepin.app_android_by_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class StopWatchActivity extends AppCompatActivity {

    private int seconds = 0;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickStart(View view) {
        running = true;
    }

    public void onClickReset(View view) {
        running = false;
    }

    public void onClickStop(View view) {
        running = false;
        seconds = 0;
    }
}