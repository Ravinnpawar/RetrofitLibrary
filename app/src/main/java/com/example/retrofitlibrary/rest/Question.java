package com.example.retrofitlibrary.rest;

import java.io.Serializable;

public class Question {
    private String title;
    private String link;

    Integer integer=new Integer(111);
    //Double
    //Serializable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
