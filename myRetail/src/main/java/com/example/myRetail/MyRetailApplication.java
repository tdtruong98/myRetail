package com.example.myRetail;

import com.example.myRetail.models.CurrencyCodes;
import com.example.myRetail.models.Current_price;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;

@SpringBootApplication
public class MyRetailApplication {

	public static void main(String[] args) {

		SpringApplication.run(MyRetailApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductRepository repository, MongoTemplate mongoTemplate) {
		// lambda

		return args -> {
			Current_price pricing1 = new Current_price(13860428, BigDecimal.valueOf(13.49), CurrencyCodes.USD);
			Current_price pricing2 = new Current_price(54456119, BigDecimal.valueOf(25), CurrencyCodes.USD);
			Current_price pricing3 = new Current_price(13264003, BigDecimal.valueOf(300), CurrencyCodes.USD);
			Current_price pricing4 = new Current_price(12954218, BigDecimal.valueOf(5.99), CurrencyCodes.USD);


			//repository.insert(pricing1);
			//repository.insert(pricing2);
			//repository.insert(pricing3);
			//repository.insert(pricing4);
		};


	}
}
