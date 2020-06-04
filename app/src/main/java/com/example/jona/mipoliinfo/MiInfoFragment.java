package com.example.jona.mipoliinfo;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MiInfoFragment extends Fragment {


    public MiInfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_mi_info, container, false);
        ImageView imagen = (ImageView)v.findViewById(R.id.imageView3);
        imagen.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.mifoto, null));
        return v;

    }

}
