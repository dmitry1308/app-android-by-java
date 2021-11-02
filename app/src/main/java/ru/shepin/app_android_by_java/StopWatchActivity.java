package ru.shepin.app_android_by_java;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class StopWatchActivity extends AppCompatActivity {

    private int seconds = 0;
    private boolean running;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);

        if (bundle != null) {
            seconds = bundle.getInt("seconds");
            running = bundle.getBoolean("running");
        }

        runTimer();
    }

    private void runTimer() {
        TextView textView = (TextView) findViewById(R.id.time_view);

        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;

                String time = String.format("%d:%02d:%02d", hours, minutes, secs);

                textView.setText(time);

                if (running) {
                    seconds++;
                }

                handler.postDelayed(this, 1000);
            }
        });
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        System.out.println("CALL METHOD onConfigurationChanged");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("seconds", seconds);
        outState.putBoolean("running",running);
    }

    public void onClickStart(View view) {
        running = true;
    }

    public void onClickReset(View view) {
        running = false;
        seconds = 0;
    }

    public void onClickStop(View view) {
        running = false;

    }
}