package com.austinegwa64.myrevisionapp.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.austinegwa64.myrevisionapp.AskQuiz;
import com.austinegwa64.myrevisionapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Question extends Fragment {

    TextView  disclaimer;
    Button quiz;
    public Question() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_question, container, false);

        disclaimer = myView.findViewById(R.id.disclaimer);
        quiz = myView.findViewById(R.id.post_quiz);
        String formatedstring = getString(R.string.quiz_disclaimer);
        Spanned txt = Html.fromHtml(formatedstring);
        disclaimer.setText(txt);

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), AskQuiz.class);
                startActivity(i);
            }
        });

        return myView;
    }

}
