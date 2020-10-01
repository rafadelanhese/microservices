package com.delanhese.bookservice.controller;

import com.delanhese.bookservice.model.Book;
import com.delanhese.bookservice.repository.BookRepository;
import com.delanhese.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("")
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @GetMapping("/{author}")
    public Book findByAuthor(@PathVariable("author") String author){
        return bookService.findByAuthor(author);
    }

    @GetMapping("/{title}")
    public List<Book> findByTitle(@PathVariable("title") String title){
        return bookService.findByTitle(title);
    }

    @PostMapping("")
    public void save(@RequestBody Book book){
        bookService.save(book);
    }

    @PutMapping("")
    public void update(@RequestBody Book book){
        bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        bookService.deleteByID(id);
    }

    @DeleteMapping("")
    public void deleteAll(){
        bookService.deleteAll();
    }
}
