package com.example.foodmanagement.repository;

import com.example.foodmanagement.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
     @Query("SELECT f FROM FoodItem f JOIN f.tags t WHERE LOWER(t) = LOWER(:tag)")
    List<FoodItem> findByTag(@Param("tag") String tag);
}
