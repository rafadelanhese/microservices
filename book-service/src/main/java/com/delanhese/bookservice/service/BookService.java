package com.delanhese.bookservice.service;

import com.delanhese.bookservice.model.Book;
import com.delanhese.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public Book findByAuthor(String author){
        return bookRepository.findByAuthor(author);
    }

    public List<Book> findByTitle(String title){
        return bookRepository.findByTitle(title);
    }

    public void save(Book book){
        bookRepository.save(book);
    }

    public void update(Book book){
        bookRepository.save(book);
    }

    public void deleteByID(String id){
        bookRepository.deleteById(id);
    }

    public void deleteAll(){
        bookRepository.deleteAll();
    }
}
