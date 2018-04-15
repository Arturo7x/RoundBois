package com.example.rafaj.fragmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentViewer extends Fragment {
    private TextView text;
    private ImageView image;
    private Planet planet;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);

        text = view.findViewById(R.id.textId);
        image = view.findViewById(R.id.planetView);
        Bundle bundle = this.getArguments();


        if(bundle != null){
            planet = bundle.getParcelable("KEY");
            Toast.makeText(getActivity(), "Item: " + planet.getName(), Toast.LENGTH_SHORT).show();
            text.setText(planet.getName());
            image.setImageResource(planet.getId());
        }

        return view;
    }


}
