package com.austinegwa64.myrevisionapp.Models;

/**
 * Created by gwaza on 3/22/2018.
 */

public class Paper {

    private int paperId;
    private String paperUrl;
    private String paperDescription;

    public Paper() {
    }

    public Paper(int paperId, String paperUrl, String paperDescription) {
        this.paperId = paperId;
        this.paperUrl = paperUrl;
        this.paperDescription = paperDescription;
    }

    public int getPaperId() {
        return paperId;
    }

    public void setPaperId(int paperId) {
        this.paperId = paperId;
    }

    public String getPaperUrl() {
        return paperUrl;
    }

    public void setPaperUrl(String paperUrl) {
        this.paperUrl = paperUrl;
    }

    public String getPaperDescription() {
        return paperDescription;
    }

    public void setPaperDescription(String paperDescription) {
        this.paperDescription = paperDescription;
    }
}
