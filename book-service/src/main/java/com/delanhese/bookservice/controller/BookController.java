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
    public Book findByAuthor(@PathVariable String author){
        return bookService.findByAuthor(author);
    }

    @GetMapping("/{title}")
    public List<Book> findByTitle(@PathVariable String tile){
        return bookService.findByTitle(tile);
    }

    @PostMapping("")
    public void findByTitle(@RequestBody Book book){
        bookService.save(book);
    }


}
