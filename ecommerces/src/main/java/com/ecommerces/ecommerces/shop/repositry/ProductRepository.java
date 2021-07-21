package com.ecommerces.ecommerces.shop.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ecommerces.ecommerces.shop.entity.Products;
/**
 * @author DINESH PATEL
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {
	public Products findByProductID(Long productID);
	
	public Products findByProductNameIgnoreCase(String productName);
}