package com.example.model;

public class BookDataRequest {
    private String bookName;
    private String authorName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "BookData{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
