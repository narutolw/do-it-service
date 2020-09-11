package com.lw.mrp.service.booktest;

import com.lw.mrp.model.booktest.Book;

import javax.inject.Named;
import java.util.List;

@Named
public interface IBookService {
    /**
     * 查询所有书籍
     *
     * @return List 查询结果
     */
    List<Book> queryAllBook();

    /**
     * 根据id查询书籍
     *
     * @param book 入繁
     * @return List 返回结果
     */
    List<Book> queryBookById(Book book);
}
