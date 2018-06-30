package com.austinegwa64.myrevisionapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.austinegwa64.myrevisionapp.BackgroundTask.SubmitQuestionToDB;

public class AskQuiz extends AppCompatActivity {
    
    Button submit;
    ImageButton getImage;
    EditText title, description;
    CheckBox anonymous;
    Spinner tag;
    String quizTitle, quizDescription, quizTag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_quiz);
        

        submit = findViewById(R.id.submit);
        getImage = findViewById(R.id.image);
        title = findViewById(R.id.txtTitle);
        description = findViewById(R.id.txtDescription);
        anonymous = findViewById(R.id.check);
        tag = findViewById(R.id.tag);
        
        submit.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitQuiz();
            }
        });
    }

    private void submitQuiz() {
        quizTitle = title.getText().toString();
        quizDescription = description.getText().toString();
        quizTag = tag.getSelectedItem().toString();

        SubmitQuestionToDB submit = new SubmitQuestionToDB(this);
        submit.execute(quizTitle, quizDescription,quizTag);

    }
}
