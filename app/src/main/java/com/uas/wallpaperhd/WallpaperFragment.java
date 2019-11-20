package com.uas.wallpaperhd;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class WallpaperFragment extends Fragment {


    public WallpaperFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wallpaper, container, false);
        Button wal1 = view.findViewById(R.id.wal1);
        Button wal2 = view.findViewById(R.id.wal2);
        Button wal3 = view.findViewById(R.id.wal3);
        Button wal4 = view.findViewById(R.id.wal4);
        Button wal5 = view.findViewById(R.id.wal5);
        Button wal6 = view.findViewById(R.id.wal6);

        wal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), ThemeActivity.class);
                String pathpic = "love";
                in.putExtra("PATH_PICTURE", pathpic);
                startActivity(in);
            }
        });

        wal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), ThemeActivity.class);
                String pathpic = "moon";
                in.putExtra("PATH_PICTURE", pathpic);
                startActivity(in);
            }
        });

        wal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), ThemeActivity.class);
                String pathpic = "patrik";
                in.putExtra("PATH_PICTURE", pathpic);
                startActivity(in);
            }
        });

        wal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), ThemeActivity.class);
                String pathpic = "abstrak1";
                in.putExtra("PATH_PICTURE", pathpic);
                startActivity(in);
            }
        });

        wal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), ThemeActivity.class);
                String pathpic = "alam2";
                in.putExtra("PATH_PICTURE", pathpic);
                startActivity(in);
            }
        });

        wal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), ThemeActivity.class);
                String pathpic = "alam8";
                in.putExtra("PATH_PICTURE", pathpic);
                startActivity(in);
            }
        });
        return view;
    }


}

