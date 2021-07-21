package com.ecommerces.ecommerces.shop.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author DINESH PATEL
 *
 */
@Entity
@Table(name = "Products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {

	@Id
	@Column(name = "prod_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productID;
	
	@Column(name = "category_id")
	private Long categoryId;
	
	@Column(name = "prod_name")
	private String productName;
	
	@Column(name = "prod_code")
	private String productCode;
	
	@Column(name = "prod_hsn")
	private String productHSN;
	
	@Column(name = "prod_type")
	private String productType;
	
	@Column(name = "prod_price")
	private String productPrice;
	
	@Column(name = "prod_costprice")
	private String productCostPrice;

	@Column(name = "created_on")
	private Date  custCreatedOn;
	
	@Column(name = "created_by")
	private String  custCreatedBy;    
	
	@Column(name = "updated_on")
	private Date  custUpdatedOn;    
	
	@Column(name = "updated_by")
	private String  custUpdatedBy; 
	

}