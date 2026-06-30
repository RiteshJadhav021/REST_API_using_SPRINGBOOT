package com.REST_API.REST_API_first.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int Author_id;
    private String author_name;
    @OneToOne(mappedBy = "author")
    @JsonBackReference
    private Book book;

    public int getAuthor_id() {
        return Author_id;
    }

    public void setAuthor_id(int author_id) {
        Author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
