package com.example.mdonline.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mdonline.R;

public class ProblemsFragment extends Fragment {

    public static ProblemsFragment newInstance(){
        ProblemsFragment fragment = new ProblemsFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_problems, container, false);

        return rootView;
    }

}