package ru.shepin.app_android_by_java;

import android.app.Activity;
import android.os.Bundle;

public class DetailActivity extends Activity {

   public static final String EXTRA_WORKOUT_ID= "id";

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        WorkoutDetailFragment fragment = (WorkoutDetailFragment)getFragmentManager().findFragmentById(R.id.detail_frag);

        int workOutId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        fragment.setWorkoutId(workOutId);
    }
}