package com.example.cardapio.controller;

//import java.util.List;
import java.util.stream.Stream;

//import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.Food.Food;
//import com.example.cardapio.Food.Food;
import com.example.cardapio.Food.FoodRepository;
import com.example.cardapio.Food.FoodRequestDTO;
import com.example.cardapio.Food.FoodResponseDTO;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food fooData = new Food(data);
        repository.save(fooData);
        return;
    }
    
    @GetMapping
    public Stream<Object> getAll(){

        Stream<Object> foodList = repository.findAll().stream().map(FoodResponseDTO::new);
        return foodList;
    }
    
}
