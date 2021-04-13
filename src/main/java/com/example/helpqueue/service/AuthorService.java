package com.example.helpqueue.service;

import com.example.helpqueue.model.Author;
import com.example.helpqueue.model.Ticket;

import java.util.Optional;

public interface AuthorService {

    boolean createAuthor(Author author);

    Optional<Author> getAuthor(Long id);

    Iterable<Author> getAuthors();

    void update(Long id, Author author);

    void delete(Long id);

}
