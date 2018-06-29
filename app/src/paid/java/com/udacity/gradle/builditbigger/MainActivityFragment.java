package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ProgressBar spinner;
    private RelativeLayout relativeLayout;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        spinner = root.findViewById(R.id.progressBar1);
        relativeLayout = root.findViewById(R.id.rl_content);
        Button button = root.findViewById(R.id.bt_tell_joke);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setVisibility(View.INVISIBLE);
                spinner.setVisibility(View.VISIBLE);
                tellJoke(v);
            }
        });
        return root;
    }

    public void tellJoke(View view) {
        Context context = getContext();
        new EndpointsAsyncTask().execute(context);
    }
}