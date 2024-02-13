package com.example;

import com.example.models.Book;
import com.example.services.BookService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;



@SpringBootTest
public class BookServiceUnitTest {

    @Autowired
    private BookService bookService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<Book> books = bookService.list();
        assertEquals(books.size(), 3);
    }
}