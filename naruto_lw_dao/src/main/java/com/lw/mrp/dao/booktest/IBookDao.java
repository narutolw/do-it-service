package com.lw.mrp.dao.booktest;

import com.lw.mrp.model.booktest.Book;
import org.apache.ibatis.annotations.Param;

import javax.inject.Named;
import java.util.List;

@Named
public interface IBookDao {
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
    List<Book> queryBookById(@Param("book") Book book);
}
