package com.thehecklers.sburrestdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/coffees")
public class RestapiDemoController {
    private final CoffeeRepository coffeeRepository;


    public RestapiDemoController(CoffeeRepository coffeeRepository){
        this.coffeeRepository = coffeeRepository;
        this.coffeeRepository.saveAll(List.of(
                new Coffee("Cafe Cereza"),
                new Coffee("Cafe Ganador"),
                new Coffee("Cafe Lareno"),
                new Coffee("Cafe Tres Pontas")
        ));
    }
    @GetMapping()
    Iterable<Coffee> getCoffees(){
        return coffeeRepository.findAll();
    }
    @GetMapping("/{id}")
    Optional<Coffee> getCoffeeById(@PathVariable String id){
        return coffeeRepository.findById(id);
    }
    @PostMapping()
    Coffee postCoffee(@RequestBody Coffee coffee){
        return coffeeRepository.save(coffee);
    }
    @PutMapping("/{id}")
    ResponseEntity<Coffee> putCoffee(@PathVariable String id, @RequestBody Coffee coffee){
       return (!coffeeRepository.existsById(id))
               ? new ResponseEntity<>(coffeeRepository.save(coffee),HttpStatus.CREATED)
               :new ResponseEntity<>(coffeeRepository.save(coffee),
               HttpStatus.OK);

    }
    @DeleteMapping("/{id}")
    void deleteCoffee(@PathVariable String id){
        coffeeRepository.deleteById(id);
    }


}
