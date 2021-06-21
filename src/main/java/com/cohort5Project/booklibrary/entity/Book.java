package com.cohort5Project.booklibrary.entity;

import javax.persistence.*;

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "book_title", nullable = false)
    private String bookTitle;

    @Column(name = "author")
    private String author;

    @Column(name = "description")
    private String description;

    @Column(name = "publish_year")
    private String publishYear;


    public Book() {
    }

    public Book(String bookTitle, String author, String description, String publishYear) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.description = description;
        this.publishYear = publishYear;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public  String getPublishYear(){
        return publishYear;
    }

    public void setPublishYear(String publishYear){
        this.publishYear = publishYear;
    }


}
