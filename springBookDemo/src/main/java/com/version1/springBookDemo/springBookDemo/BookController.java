package com.version1.springBookDemo.springBookDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("books", service.getAllBooks());
        return "index";
    }

    @GetMapping("/new")
    public String showNewBookForm(Model model) {
        Book newBook = new Book();
        model.addAttribute("book", newBook);
        return "book-form";
    }

    @PostMapping("/save")
    public String saveBook(@ModelAttribute Book book) {
        service.saveBook(book);
        return "redirect:/";
    }

    @GetMapping("/edit/{isbn}")
    public String editBook(@PathVariable String isbn, Model model) {
        model.addAttribute("book",
                service.getBookByIsbn(isbn));
        return "book-form";
    }

    @GetMapping("/delete/{isbn}")
    public String deleteBook(@PathVariable String isbn) {
        service.deleteBook(isbn);
        System.out.println("Deleted: " + isbn);
        return "redirect:/";
    }
}