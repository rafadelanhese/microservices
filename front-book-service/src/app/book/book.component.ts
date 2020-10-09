import { BookService } from './book.service';
import { Book } from './book';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {

  books : Book[];
  
  constructor(private bookService : BookService) { }

  ngOnInit(): void {
    this.bookService.findAll().subscribe(dados => this.books = dados);
  }

}
