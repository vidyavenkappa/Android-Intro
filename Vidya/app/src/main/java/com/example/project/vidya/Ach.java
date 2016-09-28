package com.example.project.vidya;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aditya.vidya.R;


public class Ach extends Fragment {

    public static Ach newInstance() {
        Ach fragment = new Ach();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.acheivements, container, false);

        return rootView;
    }
}