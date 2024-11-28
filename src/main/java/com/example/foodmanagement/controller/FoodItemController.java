package com.example.foodmanagement.controller;

import com.example.foodmanagement.model.FoodItem;
import com.example.foodmanagement.repository.FoodItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;


@RestController
@RequestMapping("/fooditems")
public class FoodItemController {

    @Autowired
    private FoodItemRepository foodItemRepository;

    @PutMapping("/{id}")
    public FoodItem updateFoodItem(@PathVariable Long id, @RequestBody FoodItem updatedFoodItem) {
        FoodItem existingFoodItem = foodItemRepository.findById(id).orElseThrow();
        existingFoodItem.setName(updatedFoodItem.getName());
        return foodItemRepository.save(existingFoodItem);
    }

    @PostMapping("/hello")
    public Map<String, String> hello() {
        Map<String, String> response = new HashMap<>();
        response.put("body", "Hello!");
        return response;
    }
}
