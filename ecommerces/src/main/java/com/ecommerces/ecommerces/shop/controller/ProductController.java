package com.ecommerces.ecommerces.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecommerces.ecommerces.shop.entity.Products;
import com.ecommerces.ecommerces.shop.service.ProductService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author DINESH PATEL
 *
 */
@RestController
@RequestMapping("/products")
@Slf4j
public class ProductController {
	@Autowired
	ProductService productService;
	
	@PostMapping("/")
	public Products saveProduct(@RequestBody Products product) {
		log.info("Product is saved");
		return productService.saveProduct(product);
	}
	
	@GetMapping("/{id}")
	public Products fetchProductById(@PathVariable("id") Long productID) {
		log.info("Product is fetch called by Id");
		return productService.findProductById(productID); 
	}
	
	@GetMapping("/name/{name}")
	public Products fetchProductByName(@PathVariable("name") String proName) {
		log.info("Product is fetch called by Name");
		return productService.findProductByName(proName); 
	}
	
	@PutMapping("/{id}")
	public Products updateProductById(@PathVariable("id") Long productID, @RequestBody Products product) {
		log.info("Product is Updated");
		return productService.updateProductById(productID,product); 
	}
	
	@DeleteMapping("/{id}")
	public String deleteProductById(@PathVariable("id") Long prodID){
		return productService.deleteProductById(prodID);
	}
}