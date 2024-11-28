package com.example.foodmanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FoodItem {

    @Id
    private Long id;
    private String name;
    private double price;
    private String cathegory;
    private String[] tags;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
