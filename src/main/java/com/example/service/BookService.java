package com.example.service;

import com.example.model.BookDataRequest;
import com.example.model.BookDataResponse;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class BookService {
    @Inject
    CacheService cacheService;

    public void addBookDetails(BookDataRequest bookData){

        cacheService.putData(bookData.getBookName(), bookData.getAuthorName());
    }
    public BookDataResponse getAuthorName(String authorName){
        try {
            String author= cacheService.getData(authorName);
            BookDataResponse bookDataResponse=new BookDataResponse();
            bookDataResponse.setAuthorName(author);
            return bookDataResponse;
        }catch (Exception e){
            System.out.println(e);
            throw e;
        }
    }
}
