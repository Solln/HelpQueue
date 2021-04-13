package com.example.helpqueue.controller;

import com.example.helpqueue.model.Author;
import com.example.helpqueue.service.AuthorServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/authors")
public class AuthorController {

    @Autowired
    AuthorServiceImp authorService;

    @PostMapping("")
    public ResponseEntity<Boolean> addAuthor(@RequestBody Author author) {
        return new ResponseEntity<>(authorService.createAuthor(author), HttpStatus.CREATED);
    }

    @GetMapping(path = "")
    public @ResponseBody
    ResponseEntity<Iterable<Author>> getAllAuthors() {
        return ResponseEntity.ok(authorService.getAuthors());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<Author>> getAuthorById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(authorService.getAuthor(id));
    }


    //Post

    //Get

    // GET /{1d}

    // GET /{1d}/tickets



}
