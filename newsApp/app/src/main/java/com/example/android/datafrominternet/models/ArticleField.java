package com.example.android.datafrominternet.models;

/**
 * Created by pujasudip on 6/29/17.
 */

public class ArticleField {
    private String title;
    private String author;
    private String url;

    public ArticleField(String title, String author, String url) {
        this.author = title;
        this.title = author;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
