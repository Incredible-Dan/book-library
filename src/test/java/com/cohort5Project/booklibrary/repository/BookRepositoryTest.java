package com.cohort5Project.booklibrary.repository;

import com.cohort5Project.booklibrary.entity.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BookRepositoryTest {

    @Autowired
    BookRepository bookRepository;

    @BeforeEach
    void setUp() {
    }
    @Test
    void updateBookLibraryListTest(){
        Book book = bookRepository.findById(1L).orElse(null);
        assertThat(book).isNotNull();
    }

}