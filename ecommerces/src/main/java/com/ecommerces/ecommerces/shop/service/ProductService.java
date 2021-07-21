package com.ecommerces.ecommerces.shop.service;

import com.ecommerces.ecommerces.shop.entity.Products;

/**
 * @author DINESH PATEL
 *
 */
public interface ProductService {

	public Products saveProduct(Products product);

	public Products findProductById(Long productID);

	public Products updateProductById(Long productID, Products product);

	public Products findProductByName(String productName);

	public String deleteProductById(Long prodID);

}
