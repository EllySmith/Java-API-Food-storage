package com.example.foodmanagement.repository;

import com.example.foodmanagement.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
 