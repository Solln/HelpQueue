package com.example.helpqueue.service;

import com.example.helpqueue.model.Author;
import com.example.helpqueue.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class AuthorServiceImp implements AuthorService {

    @Autowired
    private AuthorRepository authorRepo;

    @Override
    public boolean createAuthor(Author author) {
        //TODO logic for if save fails
        this.authorRepo.save(author);
        return true;
    }

    @Override
    public Iterable<Author> getAuthors(){
        return this.authorRepo.findAll();
    }


    @Override
    public Optional<Author> getAuthor(Long id) {
        return authorRepo.findById(id);
    }

    @Override
    public void update(Long id, Author author) {

    }

    @Override
    public void delete(Long id) {

    }

}
