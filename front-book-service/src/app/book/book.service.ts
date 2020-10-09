import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from '../../environments/environment';
import { Book } from './book';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private readonly API = `${environment.API}books`;


  constructor(private http : HttpClient) { }

  findAll(){
    return this.http.get<Book[]>(this.API);
  }
}
