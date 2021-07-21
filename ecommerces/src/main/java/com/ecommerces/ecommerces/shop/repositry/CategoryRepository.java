package com.ecommerces.ecommerces.shop.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerces.ecommerces.shop.entity.CategoryDetails;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryDetails, Long> {
	public CategoryDetails findByCategoryId(Long categoryId);
}