package com.REST_API.REST_API_first.controller;


import com.REST_API.REST_API_first.entity.Book;
import com.REST_API.REST_API_first.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired  //when you write autowired means it inherit from another class so at that class you have to write @component also...
    private BookService bookService;


//Read Operation Handler
    @GetMapping("/books")
    public List<Book> getBooks(){

        return  this.bookService.getAllBooks();
    }


    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id")int id){

        return this.bookService.getBookById(id);
    }

    //create operation handler
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        return this.bookService.addBook(book);
    }


    //delete operation handler
    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable("id") int id){
        this.bookService.deleteBookById(id);
    }

    //update operation handler
    @PutMapping("/books/{bookId}")
    public Book updateBook(@RequestBody Book book,@PathVariable("bookId") int bookId){
        return this.bookService.updateBook(book,bookId);
    }
}
