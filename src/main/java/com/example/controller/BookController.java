package com.example.controller;

import com.example.model.BookDataRequest;
import com.example.model.BookDataResponse;
import com.example.service.BookService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.annotation.QueryValue;
import jakarta.inject.Inject;

@Controller("radis/test")
public class BookController {
    @Inject
    BookService bookService;
    @Put("/")
    public MutableHttpResponse<Object> putBookData(BookDataRequest bookDataRequest){
        bookService.addBookDetails(bookDataRequest);
        return HttpResponse.ok();
    }
    @Get("/getData")
    public MutableHttpResponse<BookDataResponse> getBookAuthorName(@QueryValue(value = "bookName") String bookName){
        BookDataResponse bookDataResponse=bookService.getAuthorName(bookName);
        return HttpResponse.ok(bookDataResponse);
    }
}
