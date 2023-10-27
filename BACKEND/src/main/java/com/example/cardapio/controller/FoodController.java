package com.example.cardapio.controller;

import java.util.List;
import java.util.stream.Stream;

//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.cardapio.Food.Food;
import com.example.cardapio.Food.FoodRepository;
import com.example.cardapio.Food.FoodResponseDTO;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;
    
    @GetMapping
    public List<FoodResponseDTO> getAll(){

        Stream<Object> foodList = repository.findAll().stream().map(FoodResponseDTO::new);
        return (List<FoodResponseDTO>) foodList;
    }
    
}
