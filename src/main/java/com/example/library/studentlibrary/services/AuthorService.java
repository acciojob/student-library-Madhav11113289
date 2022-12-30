package com.example.library.studentlibrary.services;

import com.example.library.studentlibrary.models.Author;
import com.example.library.studentlibrary.repositories.AuthorRepository;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthorService {


    @Autowired
    AuthorRepository authorRepository1;

    public void create(Author author){
        System.out.println(author);
    
    log.debug("author :",author);
        author=Author.builder()
                .name(author.getName())
                .email(author.getEmail())
                .age(author.getAge())
                .country(author.getCountry())
                .build();
        authorRepository1.save(author);

    }
}