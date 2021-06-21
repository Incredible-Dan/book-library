package com.cohort5Project.booklibrary;

import com.cohort5Project.booklibrary.entity.Book;
import com.cohort5Project.booklibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);

    }
//    @Autowired
//    private BookRepository bookRepository;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        Book bookOne = new Book("THINK AND GROW RICH", "NAPOLEON HILL", "The book asserts that desire, faith, and persistence can propel one to great heights if one can", "1937");
//        bookRepository.save(bookOne);
//
//        Book bookTwo = new Book("THE GIFTED HANDS", "BEN CARSON", "This book outlines his childhood and adulthood, the joys and trials that he experienced led him to", "1992");
//        bookRepository.save(bookTwo);
//
//        Book bookThree = new Book("THINGS FALL APART", "CHINUA ACHEBE", "The book asserts that desire, faith, and persistence can propel one to great heights if one ca", "1958");
//        bookRepository.save(bookThree);
//
//        Book bookFour = new Book("THE MAN DIED!", "WOLE SHOYINKA", "This book outlines his childhood and adulthood, the joys and trials that he experienced led him to", "1972");
//        bookRepository.save(bookFour);
//
//        Book bookFive = new Book("RICH DAD POOR DAD", "ROBERT KIYOSAKI ", "The book asserts that desire, faith, and persistence can propel one to great heights if one ", "1997");
//        bookRepository.save(bookFive);



    }
}
