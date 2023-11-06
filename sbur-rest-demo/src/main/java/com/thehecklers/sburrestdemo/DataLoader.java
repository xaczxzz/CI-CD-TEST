package com.thehecklers.sburrestdemo;

import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

@Component
public class DataLoader {
    private final CoffeeRepository coffeeRepository;
    public DataLoader(CoffeeRepository coffeeRepository){
        this.coffeeRepository = coffeeRepository;
    }

    @PostConstruct
    private void loadData(){
        coffeeRepository.saveAll(List.of(
                new Coffee ("Cafè Cereza"),
                new Coffee ("Cafè Ganador"),
                new Coffee ("Cafè Lareño"),
                new Coffee("Cafè Tres Pontas")
        ));
    }
    @PutMapping("{id}")
    ResponseEntity<Coffee> putCoffee(@PathVariable String id , @RequestBody Coffee coffee){
        return (coffeeRepository.existsById(id))
                ? new ResponseEntity<>(coffeeRepository.save(coffee),
                HttpStatus.OK)
                : new ResponseEntity<>(coffeeRepository.save(coffee),
                HttpStatus.CREATED);

    }

}
