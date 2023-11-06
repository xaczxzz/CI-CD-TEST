package com.thehecklers.sburrestdemo.Repositroy;

import com.thehecklers.sburrestdemo.Domain.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Mongo_Repository {
    @Autowired
    public Author_Repositoy mongoDBAuthorRepository;

    public String findAuthor(Author author){
        mongoDBAuthorRepository.findAll();
        return "200";
    }
}
