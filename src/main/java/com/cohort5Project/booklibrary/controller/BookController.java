package com.cohort5Project.booklibrary.controller;

import com.cohort5Project.booklibrary.entity.Book;
import com.cohort5Project.booklibrary.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {


    private BookService bookService;

    public BookController(BookService bookService) {
        super();
        this.bookService = bookService;
    }

    // handler method to handle List of Books and return mode and view

    @GetMapping("/books")
    public String listOfBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());

        return "books";
    }

    @GetMapping("/books/new")
    public String uploadBookForm(Model model){
//        create book object to hold book form data
        Book book = new Book();
        model.addAttribute("book", book);
        return "upload_book";
    }

    @PostMapping("/books")
    public String saveBook(@ModelAttribute("book") Book book){
        bookService.saveBook(book);

        return "redirect:/books";
    }

    @GetMapping("/books/edit/{id}")
    public String editBookForm(@PathVariable Long id, Model model){
        model.addAttribute("book",bookService.getBookById(id));

        return "edit_book";
    }

    @PostMapping("/books/{id}")
    public String updateBook(@PathVariable Long id,
            @ModelAttribute("book") Book book,
            Model model){

        // get student from database by id

        Book existingBook = bookService.getBookById(id);

        existingBook.setId(id);
        existingBook.setBookTitle(book.getBookTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setDescription(book.getDescription());
        existingBook.setPublishYear(book.getPublishYear());

        //save updated book object

        bookService.updateBook(existingBook);
        return "redirect:/books";

    }
    // handler method to handle delete book request

    @GetMapping("/books/{id}")
    public String deleteStudent(@PathVariable Long id){
            bookService.deleteBookById(id);
            return "redirect:/books";
    }

}
