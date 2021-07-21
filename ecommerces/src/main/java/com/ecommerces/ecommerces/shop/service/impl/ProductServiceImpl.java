package com.ecommerces.ecommerces.shop.service.impl;

import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerces.ecommerces.shop.entity.Products;
import com.ecommerces.ecommerces.shop.repositry.ProductRepository;
import com.ecommerces.ecommerces.shop.service.ProductService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author DINESH PATEL
 *
 */
@Service
@Slf4j
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository prodRepositry;

	@Override
	public Products saveProduct(Products product) {
		log.info("Produuct is Saved");
		return prodRepositry.save(product);
	}

	@Override
	public Products findProductById(Long productID) {
		log.info("Product is fetched by Id");
		return prodRepositry.findByProductID(productID);
	}
	
	@Override
	public Products findProductByName(String productName) {
		log.info("Product is fetched by Name");
		return prodRepositry.findByProductNameIgnoreCase(productName);
	}

	@Override
	public Products updateProductById(Long productID, Products product) {
		log.info("Product is Updated");
		Products prod=findProductById(productID);
		
		if(Objects.nonNull(product.getProductName()) && !"".equalsIgnoreCase(product.getProductName())){
			prod.setProductName(product.getProductName());
		}
		
		if(Objects.nonNull(product.getProductCode()) && !"".equalsIgnoreCase(product.getProductCode())) {
			prod.setProductCode(product.getProductCode());
		}
		
		if(Objects.nonNull(product.getProductHSN()) && !"".equalsIgnoreCase(product.getProductHSN())) {
			prod.setProductHSN(product.getProductHSN());
		}
		
		if(Objects.nonNull(product.getProductType()) && !"".equalsIgnoreCase(product.getProductType())) {
			prod.setProductType(product.getProductType());
		}
		
		if(Objects.nonNull(product.getProductPrice()) && !"".equalsIgnoreCase(product.getProductPrice())) {
			prod.setProductPrice(product.getProductPrice());
		}
		
		if(Objects.nonNull(product.getProductCostPrice()) && !"".equalsIgnoreCase(product.getProductCostPrice())) {
			prod.setProductCostPrice(product.getProductCostPrice());
		}
		return prodRepositry.save(prod);
	}

	@Override
	public String deleteProductById(Long prodID) {
		
		 prodRepositry.deleteById(prodID);
		 return "Product is Deleted !!";
	}
}