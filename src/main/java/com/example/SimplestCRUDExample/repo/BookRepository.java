package com.example.SimplestCRUDExample.repo;

import com.example.SimplestCRUDExample.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
