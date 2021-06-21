package com.cohort5Project.booklibrary.repository;

import com.cohort5Project.booklibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
