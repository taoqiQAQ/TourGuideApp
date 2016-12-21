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
public class ParkFragment extends Fragment {


    public ParkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        ArrayList<Attractions> Attraction = new ArrayList<Attractions>();

        Attraction.add(new Attractions("flower","7AM",R.drawable.number_four));
        Attraction.add(new Attractions("flower","8AM",R.drawable.number_nine));
        Attraction.add(new Attractions("flower","8AM",R.drawable.number_eight));
        Attraction.add(new Attractions("grass","8Am",R.drawable.number_seven));
        Attraction.add(new Attractions("shop","7AM",R.drawable.number_one));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), Attraction);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
