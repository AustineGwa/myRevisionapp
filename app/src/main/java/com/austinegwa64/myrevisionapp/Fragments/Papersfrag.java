package com.austinegwa64.myrevisionapp.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.austinegwa64.myrevisionapp.PdfPage;
import com.austinegwa64.myrevisionapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Papersfrag extends Fragment {
    Button java, lang, web, networking;


    public Papersfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView =  inflater.inflate(R.layout.fragment_papersfrag, container, false);
        java = myView.findViewById(R.id.btn_java);
        lang = myView.findViewById(R.id.btn_lang);
        web = myView.findViewById(R.id.btn_web);
        networking = myView.findViewById(R.id.btn_networking);

        java.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPaper();
            }
        });

        return myView;
    }

    private void showPaper() {

        Intent i = new Intent (getActivity(),PdfPage.class);
        startActivity(i);
    }

}
