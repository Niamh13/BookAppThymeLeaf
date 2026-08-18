package com.version1.springBookDemo.springBookDemo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Book getBookByIsbn(String isbn) {
        return repository.findById(isbn).orElse(null);
    }

    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public Book updateBook(String isbn, Book book) {
        book.setIsbn(isbn);
        return repository.save(book);
    }

    public void deleteBook(String isbn) {
        repository.deleteById(isbn);
    }
}