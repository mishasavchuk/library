package com.lp.library.dao;

import com.lp.library.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "all", path = "book")
public interface BookDao extends CrudRepository<Book, Integer>
{
}
