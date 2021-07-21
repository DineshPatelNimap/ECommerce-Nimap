package com.ecommerces.ecommerces.shop.service;

import com.ecommerces.ecommerces.shop.entity.CategoryDetails;
public interface CategoryService {
	public CategoryDetails saveCategory(CategoryDetails cust);
	public CategoryDetails fetchCategoryById(Long categoryId);
	public CategoryDetails updateCategoryById(Long categoryId, CategoryDetails categoryDetails);
	public String deleteCategoryById(Long categoryId);
}