package com.version1.springBookDemo.springBookDemo;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @NotBlank(message = "ISBN is required")
    private String isbn;

    @NotBlank(message = "Author is required")
    private String author;

    @NotBlank(message = "Title is required")
    private String title;

    @Min(value = 1, message ="Pages must be at least 1")
    private int numOfPages;

    @NotBlank(message = "Genre is required")
    private String genre;

    public Book() {
    }

    public Book(String isbn, String author, String title,
                int numOfPages, String genre) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.numOfPages = numOfPages;
        this.genre = genre;
    }

    // Getters and Setters

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}