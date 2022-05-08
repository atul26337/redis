package com.example.model;

public class BookDataResponse {
    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "BookDataResponse{" +
                "authorName='" + authorName + '\'' +
                '}';
    }
}
