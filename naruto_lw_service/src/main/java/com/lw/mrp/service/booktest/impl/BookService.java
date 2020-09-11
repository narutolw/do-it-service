package com.lw.mrp.service.booktest.impl;

import com.lw.mrp.dao.booktest.IBookDao;
import com.lw.mrp.service.booktest.IBookService;
import com.lw.mrp.model.booktest.Book;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class BookService implements IBookService {

    @Inject
    private IBookDao bookDao;

    @Override
    public List<Book> queryAllBook() {
        return bookDao.queryAllBook();

    }

    @Override
    public List<Book> queryBookById(Book book) {
        return  bookDao.queryBookById(book);
    }
}
