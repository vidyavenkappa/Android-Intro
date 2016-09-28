package com.example.project.vidya;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aditya.vidya.R;


public class DreamProject extends Fragment {

    public static DreamProject newInstance() {
        DreamProject fragment = new DreamProject();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.dream, container, false);

        return rootView;
    }
}