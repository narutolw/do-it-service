package com.lw.mrp.web.booktest.impl;

import com.lw.mrp.model.booktest.Book;
import com.lw.mrp.business.booktest.IBookBusiness;
import com.lw.mrp.web.booktest.IBookWebService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@Controller
@ResponseBody
@RequestMapping("/bookService")
public class BookWebService implements IBookWebService {
    @Inject
    private IBookBusiness bookBusiness;

    @Override
    @RequestMapping(value = "/queryAllBook", method = RequestMethod.POST)
    public List<Book> queryAllBook() {
        return bookBusiness.queryAllBook();
    }

    @Override
    @RequestMapping(value = "/queryBookById", method = RequestMethod.POST)
    public List<Book> queryBookById(@RequestBody Book book) {
        return bookBusiness.queryBookById(book);
    }
}
