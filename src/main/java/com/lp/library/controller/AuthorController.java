package com.lp.library.controller;

import com.lp.library.dao.AuthorDao;
import com.lp.library.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController
{
    @Autowired
    private AuthorDao authorDao;

    @RequestMapping(path = "author", method = RequestMethod.GET)
    public Author getAuthorByName(@RequestParam String name)
    {
        return authorDao.findByName(name);
    }
}
