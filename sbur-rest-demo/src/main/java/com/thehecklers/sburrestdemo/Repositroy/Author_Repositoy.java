package com.thehecklers.sburrestdemo.Repositroy;


import com.thehecklers.sburrestdemo.Domain.Author;
import com.thehecklers.sburrestdemo.Domain.BroadCast;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface Author_Repositoy extends MongoRepository<Author,String> {
    List<Author> findByBroadCast(BroadCast broadcast);
}