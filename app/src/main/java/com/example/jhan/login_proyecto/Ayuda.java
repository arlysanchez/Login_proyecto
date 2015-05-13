package com.example.jhan.login_proyecto;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Ayuda extends Fragment {

    View rootView;



    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {

        rootView=inflater.inflate(R.layout.activity_ayuda,container,false);

        return rootView;
    }
}
