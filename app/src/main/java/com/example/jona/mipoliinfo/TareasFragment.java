package com.example.jona.mipoliinfo;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.os.Environment;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * A simple {@link Fragment} subclass.
 */
public class TareasFragment extends Fragment {


    public TareasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_tareas, container, false);
        ImageView remoteImage9Button = (ImageView)v.findViewById(R.id.imageView2);
        remoteImage9Button.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.notepad, null)); //THIS IS THE LINE THAT MAKES THE IMAGE WORK AG

        Intent launchIntent = getActivity().getPackageManager().getLaunchIntentForPackage("com.samsung.android.app.notes");
        if (launchIntent != null) {
            startActivity(launchIntent);//null pointer check in case package name was not found
        }


        return v;
    }

}
