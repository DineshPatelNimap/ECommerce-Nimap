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
import com.ecommerces.ecommerces.shop.entity.CategoryDetails;
import com.ecommerces.ecommerces.shop.service.CategoryService;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/category")
@Slf4j
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("/")
	public CategoryDetails saveCategory(@RequestBody CategoryDetails cat) {
		log.info("Customer Data Inserted "+ cat.getCategoryName());
		return categoryService.saveCategory(cat);
	}
	
	@GetMapping("/{id}")
	public CategoryDetails fetchCategoryById(@PathVariable("id") Long categoryId){
		return categoryService.fetchCategoryById(categoryId);
	}
	
	@PutMapping("/{id}")
	public CategoryDetails updateCategoryById(@PathVariable("id") Long categoryId,@RequestBody CategoryDetails categoryDetails){
		return categoryService.updateCategoryById(categoryId,categoryDetails);
	}
	
	@DeleteMapping("/{id}")
	public String deleteCategoryById(@PathVariable("id") Long categoryId) {
		return categoryService.deleteCategoryById(categoryId);
	}
}