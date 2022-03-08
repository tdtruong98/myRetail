package com.example.myRetail;

import com.example.myRetail.models.Current_price;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Current_price, Double> {

}
