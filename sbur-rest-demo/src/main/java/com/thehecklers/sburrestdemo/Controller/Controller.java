package com.thehecklers.sburrestdemo.Controller;


import com.thehecklers.sburrestdemo.Domain.Author;
import com.thehecklers.sburrestdemo.Repositroy.Author_Repositoy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@CrossOrigin("*")
@RestController
public class Controller {
    private Author_Repositoy authorRepository;

    @Autowired
    public Controller(Author_Repositoy authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping("/authors")
    public List<Author> getBroadCastAuthor() {
        System.out.print("가능");
        List<Author> ab =  authorRepository.findAll();
        return ab;
    }
    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, world!";
    }

}
