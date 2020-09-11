package com.lw.mrp.model.booktest;

import java.io.Serializable;

public class Book implements Serializable {
    /**
     * UID
     */
    private static final long serialVersionUID = 1223657749992669397L;

    /**
     * id
     */
    private String bookId;

    /**
     * 书名
     */
    private String bookName;

    /**
     * 作者
     */
    private String bookAuthor;

    /**
     * 内容
     */
    private String bookContent;

    /**
     * 添加日期
     */
    private String bookAddDate;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookContent() {
        return bookContent;
    }

    public void setBookContent(String bookContent) {
        this.bookContent = bookContent;
    }

    public String getBookAddDate() {
        return bookAddDate;
    }

    public void setBookAddDate(String bookAddDate) {
        this.bookAddDate = bookAddDate;
    }
}
