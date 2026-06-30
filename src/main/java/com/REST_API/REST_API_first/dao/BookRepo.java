package com.REST_API.REST_API_first.dao;

import com.REST_API.REST_API_first.entity.Book;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends JpaRepository<Book,Integer> {
//    public Book findById(int id);

}
