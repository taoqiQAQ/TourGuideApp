package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ZooFragment extends Fragment {


    public ZooFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        ArrayList<Attractions> Attraction = new ArrayList<Attractions>();

        Attraction.add(new Attractions("monkey","9AM",R.drawable.color_black));
        Attraction.add(new Attractions("fish","9AM",R.drawable.color_brown));
        Attraction.add(new Attractions("shop","8AM",R.drawable.color_dusty_yellow));
        Attraction.add(new Attractions("activity","8AM",R.drawable.color_gray));
        Attraction.add(new Attractions("tiger","9AM",R.drawable.color_green));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), Attraction);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;

    }

}
