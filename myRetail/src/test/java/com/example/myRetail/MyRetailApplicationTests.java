package com.example.myRetail;

import com.example.myRetail.models.Product;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.junit.jupiter.params.ParameterizedTest;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.web.client.RestTemplate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AllArgsConstructor
class MyRetailApplicationTests {
	/*
	TODO Add junit Tests:


	private final ProductService productService;

	@Mock
	RestTemplate restTemplate;

	// test ProductService.getProductById
	@Test
	void testGetProductById() throws Exception {
		//JSONObject obj = new JSONObject("{ \"data\": {\"product\": {\"tcin\": \"13860428\", \"item\": {\"product_description\": {\"title\": \"The Big Lebowski (Blu-ray)\", }}}}}");
		Product testProd = productService.getProductById(13860428);

		String testName = testProd.getName();

		assertEquals("The Big Lebowski (Blu-ray)", testName);
	}


	// Test invalid or empty ID and assert HTTPClientErrorException$NotFound
	@Test(expected = HTTPClientErrorException.class)
	void testGetProductByInvalidId() throws Exception {

		Product testProd = productService.getProductById(1234);

	}


	// Mock Target API call to get canned response (test for JSON parsing)
	@Test
	void testCannedProduct() throws Exception {
		String responseBody = "{ \"data\": {\"product\": {\"tcin\": \"12345\", \"item\": {\"product_description\": {\"title\": \"Tomato Soup\", }}}}}";
		JSONObject obj = new JSONObject(responseBody);

		Mockito.when(restTemplate.getForEntity(uri, String.class)).thenReturn(responseBody);

		Product testProd = productService.getProductById(12345);
		String testName = testProd.getName();

		assertEquals("Tomato Soup", testName);
	}

	 */
}
