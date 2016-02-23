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
public class Book
{
    @Id
    @GeneratedValue
    @NonNull
    private int id;

    @NonNull
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "AuthorBook",
            joinColumns = @JoinColumn(name = "AuthorId"),
            inverseJoinColumns = @JoinColumn(name = "BookId")
    )
    private Set<Author> authors = new HashSet<Author>();

    public void addAuthor(Author author)
    {
        authors.add(author);
    }
}
