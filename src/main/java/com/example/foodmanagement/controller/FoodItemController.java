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

    @PostMapping("/")
    public Map<String, String> addItem(@RequestBody FoodItem item) {
        foodItemRepository.save(item);
        Map<String, String> response = new HashMap<>();
        response.put("body", "Item added: " + item.getName());
        return response;
    }

    @GetMapping("/")
    public List<FoodItem> getAllFoodItems() {
        return foodItemRepository.findAll();
    }

    @GetMapping("/tag")
    public List<FoodItem> getAllFoodItems(@RequestParam(required = true) String tag) {
        if (tag != null && !tag.isEmpty()) {
            return foodItemRepository.findByTag(tag);
        } else {
            return foodItemRepository.findAll();
        }
    }
}
