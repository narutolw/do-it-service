package com.lw.mrp.web.booktest;


import com.lw.mrp.model.booktest.Book;

import java.util.List;

public interface IBookWebService {
    /**
     * 查询所有书籍
     *
     * @return List 查询结果
     */
    List<Book> queryAllBook();

    /**
     * 根据id查询书籍
     *
     * @param book 入参
     * @return List 返回结果
     */
    List<Book> queryBookById(Book book);
}
