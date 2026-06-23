package com.REST_API.REST_API_first.service;

import com.REST_API.REST_API_first.entity.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookService {
    private static List<Book> list=new ArrayList<>();
//here we write List<Book> coz it is user defined data type so it can return Book Object...
    static {
        list.add(new Book(1,"java","ritesh"));
        list.add(new Book(2,"python","rushi"));
        list.add(new Book(3,"C","adi"));

        //static block execute only once to store data into memory means in list...
    }

    public List<Book> getAllBooks(){

        return list;
    }
    public Book getBookById(int id){
        for(Book book:list){
            if(book.getId()==id){
                return book;
            }
        }
        return null;
    }

    public Book addBook(Book b){
            list.add(b);
            return b;
    }

    public void deleteBookById(int id){
        list.removeIf(book -> book.getId()==id);
    }

    public Book updateBook(Book book,int bookId){
        for(Book b:list){
            if(b.getId()==bookId){
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
            }
        }
        return book;
    }

}
