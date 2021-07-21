package com.ecommerces.ecommerces.shop.service.impl;

import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerces.ecommerces.shop.entity.CategoryDetails;
import com.ecommerces.ecommerces.shop.repositry.CategoryRepository;
import com.ecommerces.ecommerces.shop.service.CategoryService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepositry;

	@Override
	public CategoryDetails saveCategory(CategoryDetails category) {
		return categoryRepositry.save(category);
	}

	@Override
	public CategoryDetails fetchCategoryById(Long categoryId) {
		return categoryRepositry.findById(categoryId).get();
	}

	@Override
	public CategoryDetails updateCategoryById(Long categoryId, CategoryDetails categoryDetails) {
		CategoryDetails cDetails=fetchCategoryById(categoryId);
		log.info("I am From Update "+ categoryId +" CategoryDetails "+ categoryDetails.getCategoryName());
		if(Objects.nonNull(categoryDetails.getCategoryName()) && !"".equalsIgnoreCase(categoryDetails.getCategoryName())){
			log.info("I am Inside");
			cDetails.setCategoryName(categoryDetails.getCategoryName());
		}
		return categoryRepositry.save(cDetails);
	}

	@Override
	public String deleteCategoryById(Long categoryId) {

		categoryRepositry.deleteById(categoryId);
		
		return "Category Deleted Sucessully !!";
	}
}