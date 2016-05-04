package com.example.android.popularmovies_stage2.DataObjects;

/**
 * Created by Saurabh on 5/1/2016.
 */
/*
*
* simple object to store all the information
* for a movie being used in the UI
*
* */
public class MovieReview {

    private String author;
    private String content;

    public MovieReview(String author, String content){
        this.author = author;
        this.content = content;;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

}