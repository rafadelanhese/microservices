package com.delanhese.bookservice.repository;

import com.delanhese.bookservice.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {

    public List<Book> findAll();
    public Book findByAuthor(String author);
    public List<Book> findByTitle(String title);
}
