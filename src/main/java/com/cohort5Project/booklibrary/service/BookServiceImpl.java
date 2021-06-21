package com.cohort5Project.booklibrary.service;

import com.cohort5Project.booklibrary.entity.Book;
import com.cohort5Project.booklibrary.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Slf4j
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        super();
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.getById(id);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBookById(Long id) {
       bookRepository.deleteById(id);

    }


    @PostConstruct
    public void populateRepository() {

        Book bookOne = new Book("THINK AND GROW RICH", "NAPOLEON HILL", "The book asserts that desire, faith, and persistence can propel one to great heights if one can", "1937");
        bookRepository.save(bookOne);

        Book bookTwo = new Book("THE GIFTED HANDS", "BEN CARSON", "This book outlines his childhood and adulthood, the joys and trials that he experienced led him to", "1992");
        bookRepository.save(bookTwo);

        Book bookThree = new Book("THINGS FALL APART", "CHINUA ACHEBE", "The book asserts that desire, faith, and persistence can propel one to great heights if one ca", "1958");
        bookRepository.save(bookThree);

        Book bookFour = new Book("THE MAN DIED!", "WOLE SHOYINKA", "This book outlines his childhood and adulthood, the joys and trials that he experienced led him to", "1972");
        bookRepository.save(bookFour);

        Book bookFive = new Book("RICH DAD POOR DAD", "ROBERT KIYOSAKI ", "The book asserts that desire, faith, and persistence can propel one to great heights if one ", "1997");
        bookRepository.save(bookFive);
        log.info("Populated ");
    }







}
