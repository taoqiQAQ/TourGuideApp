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
public class BeachFragment extends Fragment {


    public BeachFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attractions_list, container, false);

        ArrayList<Attractions> Attraction = new ArrayList<Attractions>();

        Attraction.add(new Attractions("seawater","8AM",R.drawable.number_three));
        Attraction.add(new Attractions("shop","8AM",R.drawable.number_two));
        Attraction.add(new Attractions("beach","7AM",R.drawable.number_seven));
        Attraction.add(new Attractions("shop","8AM",R.drawable.number_three));
        Attraction.add(new Attractions("activity","9AM",R.drawable.number_nine));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), Attraction);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
