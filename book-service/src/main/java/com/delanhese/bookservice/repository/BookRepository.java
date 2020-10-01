package com.delanhese.bookservice.repository;

import com.delanhese.bookservice.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {

    public List<Book> findAll();
    @Query("SELECT * FROM Book book WHERE book.author = :author")
    public Book findByAuthor(@Param("author") String author);
    @Query("SELECT * FROM Book book WHERE book.title = :title")
    public List<Book> findByTitle(@Param("title") String title);
}
