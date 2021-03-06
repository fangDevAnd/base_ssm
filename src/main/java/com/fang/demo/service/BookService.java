package com.fang.demo.service;

import com.fang.demo.model.Book;
import com.fang.demo.model.Category;
import com.fang.demo.model.Book;
import com.fang.demo.model.Category;

import java.util.List;

public interface BookService {

    List<Category> getAllCategories();

    Category getCategory(int id);

    List<Book> getAllBooks();

    Book save(Book book);

    Book update(Book book);

    Book get(long id);

    long getNextId();

    void delBook(long id);
}
