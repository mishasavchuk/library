package com.lp.library.entity;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class Author
{
    @Id
    @GeneratedValue
    @NonNull
    private int id;

    @NonNull
    private String name;

    @ManyToMany(mappedBy = "authors",cascade = CascadeType.ALL)
    private Set<Book> books = new HashSet<Book>();

    public void addBook(Book book)
    {
        books.add(book);
    }
}
