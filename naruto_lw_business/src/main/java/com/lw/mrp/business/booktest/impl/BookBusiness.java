package com.lw.mrp.business.booktest.impl;

import com.lw.mrp.business.booktest.IBookBusiness;
import com.lw.mrp.service.booktest.IBookService;
import com.lw.mrp.model.booktest.Book;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class BookBusiness implements IBookBusiness {
    @Inject
    private IBookService bookService;

    @Override
    public List<Book> queryAllBook() {
        return bookService.queryAllBook();
    }

    @Override
    public List<Book> queryBookById(Book book) {
        return bookService.queryBookById(book);
    }

}
