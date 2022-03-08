package com.example.myRetail;

import com.example.myRetail.models.Current_price;
import com.example.myRetail.models.Product;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import org.json.*;

@AllArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    /*
        Call External API with product id, parse JSON response to grab title, grab pricing info from internal data store
        Returns product with above information
     */
    public Product getProductById(int id) throws Exception {
        String title = "";
        String uri = "https://redsky-uat.perf.target.com/redsky_aggregations/v1/redsky/case_study_v1?key=3yUxt7WltYG7MFKPp7uyELi1K40ad2ys&tcin=" + String.valueOf(id);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> targetResponse = restTemplate.getForEntity(uri, String.class);

        if (targetResponse.hasBody()) {
            // Read Response as JSON object and parse to find title
            JSONObject obj = new JSONObject(targetResponse.getBody());
            title = obj.getJSONObject("data").getJSONObject("product").getJSONObject("item").getJSONObject("product_description").getString("title");
        }

        // Response object with ID, title we fetched from target api, and pricing we got from our data store
        Product myProduct = new Product(id, title, productRepository.findById((double) id).orElseThrow(Exception::new));
        return myProduct;
    }

    public Current_price updateProductById(int id, Current_price updated) {

        // Find price by id and update with new values
        productRepository.findById((double) id).map(current_price -> {
            current_price.setValue(updated.getValue());
            current_price.setCurrency_code(updated.getCurrency_code());
            return productRepository.save(current_price);
        }).orElseGet(() -> {  // If unable to update current item, create new one
            updated.setId(id);
            return productRepository.save(updated);
        });
        return null;
    }
}
