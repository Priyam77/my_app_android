package com.example.emog;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BazarFragment extends Fragment {

    Toolbar bazartoolbar;

    public BazarFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bazar, container, false);

       bazartoolbar =(Toolbar) view.findViewById(R.id.bazartoolbar);

         return view;
    }
}