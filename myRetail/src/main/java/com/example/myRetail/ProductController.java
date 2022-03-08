package com.example.myRetail;

import com.example.myRetail.models.Current_price;
import com.example.myRetail.models.Product;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/*
    Class to receive HTTP requests from clients
 */

@RestController
@RequestMapping("myRetail/v1/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    // Get product Info by Id
    @GetMapping("/{id}")
    public Product retrieveProduct(@PathVariable int id) throws Exception {
        return productService.getProductById(id);
    }

    // Update Product's pricing info by Id
    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Current_price updateProduct(@PathVariable int id, @RequestBody Current_price updatedPrice) throws Exception {

        return productService.updateProductById(id, updatedPrice);
    }


}
