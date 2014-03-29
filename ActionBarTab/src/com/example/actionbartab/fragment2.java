package com.example.actionbartab;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class fragment2 extends Fragment  {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.layout2, container, false);
        
        Toast.makeText(getActivity(), "page 2", Toast.LENGTH_LONG).show();
        
        
        
        
        
        
        return rootView;
    }

}
