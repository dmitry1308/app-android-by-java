package ru.shepin.app_android_by_java;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import lombok.Data;
import lombok.Setter;


@Setter
public class WorkoutDetailFragment extends Fragment {
    private long workoutId;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        View view = getView();
        if (view != null) {
            TextView title = view.findViewById(R.id.textTitle);
            WorkOut workout = WorkOut.workouts[(int) workoutId];
            title.setText(workout.getName());


            TextView description = view.findViewById(R.id.textDescription);
            description.setText(workout.getDescription());

        }
    }
}