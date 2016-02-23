package com.lp.library.dao;

import com.lp.library.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorDao extends CrudRepository<Author, Integer>
{
    Author findByName(String name);
}
