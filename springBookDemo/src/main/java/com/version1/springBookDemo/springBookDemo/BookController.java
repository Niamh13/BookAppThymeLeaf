package com.version1.springBookDemo.springBookDemo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String viewHomePage(@RequestParam(required = false) String query, Model model) {
        model.addAttribute("books", service.searchBooks(query));
        model.addAttribute("query", query);
        return "index";
    }

    @GetMapping("/new")
    public String showNewBookForm(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("isEdit", false);
        return "book-form";
    }

    @PostMapping("/save")
    public String saveBook(@Valid @ModelAttribute Book book,
                           BindingResult result,
                           Model model) {
        if (result.hasErrors()) {
            boolean isEdit = service.getBookByIsbn(book.getIsbn()) != null
                    && !book.getIsbn().isBlank();
            model.addAttribute("isEdit", isEdit);
            return "book-form";
        }
        service.saveBook(book);
        return "redirect:/";
    }

    @GetMapping("/edit/{isbn}")
    public String editBook(@PathVariable String isbn, Model model) {
        model.addAttribute("book", service.getBookByIsbn(isbn));
        model.addAttribute("isEdit", true);
        return "book-form";
    }

    @PostMapping("/delete/{isbn}")
    public String deleteBook(@PathVariable String isbn) {
        service.deleteBook(isbn);
        return "redirect:/";
    }
}