package com.example.prashantpc.fragmentexample;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    int workOutID;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        String name = WorkOut.workOuts[workOutID].getName();
        String desc = WorkOut.workOuts[workOutID].getDescription();

        TextView nameOfWorkout         = (TextView)getView().findViewById(R.id.workout_name);
        TextView descriptionOfWorkout  = (TextView)getView().findViewById(R.id.workout_description);

        nameOfWorkout.setText(name);
        descriptionOfWorkout.setText(desc);
    }

    public void setWorkOutID(int workOutID) {
        this.workOutID = workOutID;
    }
}
