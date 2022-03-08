package com.example.myRetail.models;

import com.example.myRetail.models.Current_price;
import lombok.Data;

@Data
public class Product {

    private int id;  // unique productId
    private String name;  // Name of product
    private Current_price current_price;  // Product price info

    public Product(int id, String name, Current_price current_price) {
        this.id = id;
        this.name = name;
        this.current_price = current_price;
    }
}
