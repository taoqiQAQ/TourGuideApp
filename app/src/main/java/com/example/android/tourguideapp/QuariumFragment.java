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
public class QuariumFragment extends Fragment {


    public QuariumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        ArrayList<Attractions> Attraction = new ArrayList<Attractions>();

        Attraction.add(new Attractions("fish","8AM",R.drawable.color_red));
        Attraction.add(new Attractions("fish","8AM",R.drawable.color_mustard_yellow));
        Attraction.add(new Attractions("shop","8AM",R.drawable.color_white));
        Attraction.add(new Attractions("shop","7AM",R.drawable.number_eight));
        Attraction.add(new Attractions("activity","7AM",R.drawable.number_five));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), Attraction);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
