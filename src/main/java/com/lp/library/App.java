package com.lp.library;

import com.lp.library.config.PersistenceConfig;
import com.lp.library.dao.AuthorDao;
import com.lp.library.entity.Author;
import com.lp.library.entity.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main(String[] args)
    {
       /* BookDao bookDao = new AnnotationConfigApplicationContext(PersistenceConfig.class).getBean(BookDao.class);

        bookDao.save(new Book(1, "Rak"));*/

        AuthorDao authorDao = new AnnotationConfigApplicationContext(PersistenceConfig.class).getBean(AuthorDao.class);

        Author author = new Author(1, "Joshua Bloch");
        author.addBook(new Book(2, "Effective Java"));

        authorDao.save(author);
    }
}
