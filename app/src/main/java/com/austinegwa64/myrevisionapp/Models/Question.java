package com.austinegwa64.myrevisionapp.Models;

/**
 * Created by gwaza on 3/22/2018.
 */

public class Question {

    private  int questionId;
    private String questionUrl;

    public Question() {
    }

    public Question(int questionId, String questionUrl) {
        this.questionId = questionId;
        this.questionUrl = questionUrl;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionUrl() {
        return questionUrl;
    }

    public void setQuestionUrl(String questionUrl) {
        this.questionUrl = questionUrl;
    }
}
