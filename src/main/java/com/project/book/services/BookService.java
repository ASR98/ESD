package com.project.book.services;

import java.util.List;

import com.project.book.model.Book;

public interface BookService {
Book addBook(Book book);
List<Book> getAllBooks();
Book getBookByISBN(String isbn);
}
